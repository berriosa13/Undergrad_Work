/*
    Anthony Berrios - Unix Shell Assignment
*/
#include<stdio.h>
#include<string.h> 
#include<stdlib.h> 
#include<unistd.h> 
#include<sys/types.h> 
#include <fcntl.h>
#include <sys/stat.h>
#include<sys/wait.h> 

// Declare and initialize globals
int path_set = 0;
int path_count = 1;
char path[20000] = "/bin"; 
char *command[20] = {[0 ... 19] = NULL};
int cmd_args = 0; 
// Built-in shell commands declared
void grsh_cd(char **args);
void grsh_exit(char **args);
void grsh_path(char **args);

#define tok_buff_size 64
#define tok_delim " \t\r\n\a"
// Creates universal error message for grsh shell
char error_message[30] = "An error has occurred\n";
// char pointer array that recognizes built-in commands when typed
void *built_in_cmd_str[] = {"cd", "exit", "path"};
// int pointer array that adds all built-ins into an array
void (*built_in_functions[]) (char **) = {
    &grsh_cd, &grsh_exit, &grsh_path
};
// function that returns the amount of built-in cmds
int grsh_num_built_ins() {
    return sizeof(built_in_cmd_str) / sizeof(char *);
}
// built-in cmd for "cd"
void grsh_cd(char ** args) {
    char *cd_path = args[1];
    if(cd_path == NULL) {
        write(STDERR_FILENO, error_message, strlen(error_message));
    }
    else {
        if(chdir(cd_path) != 0) {
            write(STDERR_FILENO, error_message, strlen(error_message));
        }
    } 
}
// built-in cmd for "exit"
void grsh_exit(char **args) {
    exit(0);
}
// built-in cmd for "path"
void grsh_path(char **args) {
    int i = 2;
    if(args[1] == NULL) {
        memset(path, 0, sizeof(path));
    }
    else
    {
        memset(path, 0, sizeof(path));
        strcpy(path, args[1]);
        while (args[i] != NULL)
        {
            strcat(path, ":");
            strcat(path, args[i]);
            ++i;
        }   
    }  
 }
// creates processes to be executed
int grsh_launch() {
    pid_t pid; 
    char file_path[4096];
    memset(file_path, 0, sizeof(file_path));
    char *save;
    char *path_tok;
    int status;
    
    path_tok = strtok_r(strdup(path), ":", &save);
    while(path_tok != NULL) {
        strcpy(file_path, path_tok);
        strcat(file_path, "/");
        strcat(file_path, command[0]);
        if(access(file_path, X_OK) == 0) {
            break;
        }
        memset(file_path, 0, sizeof(file_path));
        path_tok = strtok_r(NULL, ":", &save);
    }
    if(strcmp(file_path, "") == 0) {
        write(STDERR_FILENO, error_message, strlen(error_message));
        return 1; 
    }

    pid = fork(); 

    if(pid == 0) {
        execv(file_path, command); 
        write(STDERR_FILENO, error_message, strlen(error_message));
        exit(EXIT_FAILURE);

    }  else if(pid < 0) {
        write(STDERR_FILENO, error_message, strlen(error_message));
        exit(EXIT_FAILURE);
    }   
    else {
        do {
            waitpid(pid, &status, WUNTRACED);
        }   while (!WIFEXITED(status) && !WIFSIGNALED(status));
    }
       return 1; 
}   
// executes one command
int grsh_execute_cmd() {

    if(cmd_args == 0)
        return 0; 

    int i;
    for(i = 0; i < sizeof(built_in_cmd_str) / sizeof(built_in_cmd_str[0]); ++i) {
        if (strcmp(command[0], built_in_cmd_str[i]) == 0)
        {
            (*built_in_functions[i])(command);
            return 1; 
        } 
      }
      return grsh_launch();
    }
    // runs if multiple commands are given at once
    int grsh_execute_cmds(char *in) {
        int status = 0; 
        int out, error, save_out, save_error;
        char *save;
        char *tok;  

        tok = strtok_r(strdup(in), tok_delim, &save); 
        while(tok != NULL) {
            if(strcmp(tok, "&") == 0) {
                status = grsh_execute_cmd(); 
            }
            else if (strcmp(tok, ">") == 0) {
                tok = strtok_r(NULL, tok_delim, &save);
                out = open(tok, O_RDWR |O_CREAT| O_APPEND, 0600);
                if(out == -1) {
                    write(STDERR_FILENO, error_message, strlen(error_message));
                    exit(EXIT_FAILURE);
                }
                error = open(tok, O_RDWR |O_CREAT| O_APPEND, 0600);
                if(error == -1) {
                    write(STDERR_FILENO, error_message, strlen(error_message));
                    exit(EXIT_FAILURE);
                }
                save_out = dup(fileno(stdout));
                save_error = dup(fileno(stderr));

                if(dup2(out, fileno(stdout)) == -1)
                {
                    write(STDERR_FILENO, error_message, strlen(error_message));
                    exit(EXIT_FAILURE);
                }
                if(dup2(error, fileno(stdout)) == -1) {
                    write(STDERR_FILENO, error_message, strlen(error_message));
                    exit(EXIT_FAILURE);
                }
                status = grsh_execute_cmd();

                fflush(stdout);
                close(out);
                fflush(stderr);
                close(error);

                dup2(save_out, fileno(stdout));
                dup2(save_error, fileno(stderr));

                close(save_out);
                close(save_error);
            }
            else {
                command[cmd_args++] = tok; 
            }

            tok = strtok_r(NULL, tok_delim, &save);

            if(status) {
                status = 0;
                memset(command, 0, sizeof(command));
                cmd_args = 0; 
            }
        }
        if(cmd_args > 0) {
            status = grsh_execute_cmd();
        }
        if(status) {
            status = 0;
            memset(command, 0, sizeof(command));
            cmd_args = 0; 
        }
        return 0; 
    }
 // reads command and runs them if no file is found
void shell_loop() {
       char *line = NULL;
        size_t buffer = 0;
        ssize_t read; 

        printf("grsh> ");
        while((read = getline(&line, &buffer, stdin)) != -1) {
            grsh_execute_cmds(line);
            printf("grsh> ");
        }              
    }

// reads in file commands and runs them
void inputFile(char *file) {
    char *line = NULL;
    size_t buffer = 0;
    ssize_t read; 
    FILE *f = fopen(file, "r");

    if(!f) {
        write(STDERR_FILENO, error_message, strlen(error_message));
        exit(1);
    }
    while((read = getline(&line, &buffer, f)) != -1) {
        grsh_execute_cmds(line);
    }
    fclose(f);
}
 // main
int main(int argc, char *argv[]) {
    printf("\n");
    if(argc < 2) {
        shell_loop();
    }
    else {
        inputFile(argv[1]);
    }
    return 0;
}   
