#include <stdlib.h>
#include <stdio.h>
#include <string.h>

 int main(int argc, char *argv[]) {

    int num_array[100], element, size = 0, i, j, temp; // declares array
    FILE *f = fopen(argv[1], "r"); // cmd line arg, reads in file

    if (f == NULL)
    {
        printf("File Not Found");   // exits program if file is unavailable
        return 0;
    }
    
    for(i = 0; !feof(f) && fscanf(f, "%d", &element); i++) {     // reads file int by int
        num_array[i] = element; 
        size = i; 
    }

    for(i = 0; i < size-1; i++) {       // nested loop that sorts array
        for(j = i+1; j < size; j++) {
            if(num_array[i] > num_array[j]) {
                temp = num_array[i];
                num_array[i] = num_array[j];
                num_array[j] = temp; 
            }
        }
    }
    for(i = 0; i < size; i++) {
        printf("%d ", num_array[i]); // prints out array
    }
    fclose(f);  // closes file

}
