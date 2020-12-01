/*
Anthony Berrios

Develop a C program called my_cat.c that emulates the primary functionality of the Unix tool cat. Specifications for my_cat are as follows:

my_cat reads a text file as specified by the user and prints its contents exactly as is.
my_cat can be invoked with one or more files on the command line; it should just print out each file in turn.
In all non-error cases, my_cat should exit with status code 0, usually by returning a 0 from main() (or by calling exit(0)).
If no files are specified on the command line, my_cat should just exit and return 0.
Note that this is slightly different than the behavior of normal UNIX cat (if you'd like to, figure out the difference).
If the program tries to read a file and fails, it should print the exact message "my_cat: cannot open file" (followed by a newline) and exit with a status of code 1.
If multiple files are specified on the command line, the files should be printed out in order until the end of the file list is reached or an error opening a file is reached (at which point the error message is printed and my_cat exits).


*/

#include <stdio.h>
#include <stdlib.h>

int main (int argc, char *argv[]) {

    FILE *f;       // declare file
    char ch;       // declare char var
    int i;         // declare int var for loop

    // exits program with status code "0" if no file is specified
    if(argc == 1) {
        exit(0);    
    }

    // opens and lopos through file(s) 
    for(i = 1; i < argc; i++) {
        f = fopen(argv[i], "r");
        // if file is NULL, error message is printed
        if(f == NULL) {
            printf("my_cat: Cannot open file \n");
            exit(1);
        }

        // calls fgetc() to read each character and displays contents
        ch = fgetc(f);
        while (ch != EOF)
        {
            printf("%c", ch);
            ch = fgetc(f);
        }
        fclose(f);  // closes file
    }
    printf("\n");
    return 0;   
}

