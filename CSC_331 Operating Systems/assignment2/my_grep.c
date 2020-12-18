
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#define MAXLINE 1024

int main (int argc, char *argv[]) {

	char *search_term = argv[1];
	char buff[MAXLINE];
    char *line = NULL;
    char *file_name; 
    size_t st; 
    ssize_t sst = 0; 
    FILE *f;
    int i;  
    
    // If no file is passes as an arg, exit with status code 1 
    if(argc <= 1) {
        printf("my_grep: searchterm [file ...]\n");
        exit(1);
    }

    if(argc < 3) {
        while (fgets(buff, MAXLINE, stdin) != NULL)
        {
            if(strstr(buff, search_term) != NULL) {
                printf("%s", buff);
                
            }
        }
    }
    else {
        /* scans thorugh file using fopen */
        for( i = 2; i < argc; ++i) {
            file_name = argv[1];
            f = fopen(file_name, "r");
            /* prints out "my_grep: cannot open file" with
             status code 1 if file fails to open */
                if(!f) {
                    printf("my_grep: cannot open file\n");
                    exit(1);
                }
                while((sst = getline(&line, &st, f)) != -1) {
                    if(strstr(line, search_term) != NULL) {
                        printf("%s", line);
                    }
                }
                fclose(f);
        }  
    }
    return 0;
}
