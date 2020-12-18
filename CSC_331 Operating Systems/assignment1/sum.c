#include <stdio.h>
#include <stdlib.h>
#include<math.h>

int main (int argc, char *argv[]) {

 FILE *f;  // declare file
  f = fopen(argv[1], "r");  // accepts a single command line argument
                            // representing the path to a text file
  int numArray[10];   // creates array of size 10
  int i; 

  if(f == NULL) {
    printf("File Not Found");   // exits program if file cannot be found
    exit(0);
  }
    int sum;

    for(i = 0; i < 10; i++) {   // scans through file and adds #'s into array
    fscanf(f, "%d", &numArray[i]);  
    sum += numArray[i];   // adds all #'s together
    }

   printf("%d\n",sum); // prints out sum

  fclose(f);  // closes file
  return 0; 

}
