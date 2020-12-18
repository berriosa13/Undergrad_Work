/*

Implement a C program called my_wc.c that emulates the primary functionalities of the UNIX tool wc. Specifications for my_wc are as follows:

Your program my_wc reads text file as specified by the user, counts the number of lines, words, and characters within the files based on the options (or the lack thereof), and prints out the values of each file on a single line, with each value separated by a single white space. The name of that file is printed out at the end of that line, separated by a single white space.
If my_wc is passed with no command-line arguments, it should print "my_wc: [option ...] [file ...]" (followed by a newline) and exit with status 1.
If my_wc encounters a file that it cannot open, it should print "my_wc: cannot open file" (followed by a newline) and exit with status 1.
There are three possible options for my_wc: -l, -w, and -c. The options represent the number of lines, words, and characters, respectively.
If my_wc is invoked without any option, all three will be printed out in the order of lines, words, and characters, respectively.
If my_wc is invoked with any combination of options (maximum of three and the options cannot be repeated), the corresponding numbers will be printed out (in the order of line, word, and character, regardless of how the options are ordered in the command line).
If the options are passed incorrectly (more than three options or repeated options), my_wc should print "my_wc: [option ...] [file ...]" (followed by a newline) and exit with status 1.
Your program my_wc can be invoked with one or more files on the command line; it should just print out the results of each file on a single line. The options will be applied to all files.

*/

#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include <stdbool.h>
#include <string.h>

int main(int argc, char *argv[]){

    bool displayLines;
    bool displayWords;
    bool displayCharacters;
    int lines; 
    int words; 
    int characters; 
    int count = 1;
    int i = 1; 
    char *fileName; 
    FILE *F;
    char temp;
    char curr; 

        if(argc >= 2) {
            displayLines = false; 
            displayWords = false; 
            displayCharacters = false;

            for(i = 1; i < argc; ++i) {
            if(strcmp(argv[i], "-1") == 0) {
                displayLines = true;
                count++;
            }  
            if(strcmp(argv[i], "-w") == 0) {
            displayWords = true;
            count++;
            }
            if(strcmp(argv[i], "-c") == 0) {
            displayCharacters = true; 
            count++;
            }
         }  

        if(!displayLines && !displayWords & !displayWords) {
            displayLines = true;
            displayWords = true; 
            displayWords = true; 
        }

        for(i = 1; i < argc; ++i) {
            fileName = argv[i];
            F = fopen(fileName, "r");

            if(F == NULL) {
                printf("my_wc: cannot open file\n");
                exit(1);
            }
            else {
                lines = 0;
                words = 0;
                characters = 0;
                temp = ' ';
                curr = ' ';

                while(fscanf(F, "%c", &curr) != EOF) {
                    characters++;
                    if(curr == '\n')
                        lines++;

                    if(isspace(curr) && !isspace(temp)) {
                        words++;
                        temp = curr;   
                    }      
                }
                fclose(F);

                if(displayLines) {
                    printf("%d ", lines);
                }
                if(displayWords) {
                    printf("%d ", words);
                }
                if(displayCharacters) {
                    printf("%d ", characters);
                }
                printf("%s\n", fileName);
            }
        } 
      }   
        else {
             printf("my_wc: [option ...] [file ...]\n");
             exit(1);
        }
        return 0;
}





    
