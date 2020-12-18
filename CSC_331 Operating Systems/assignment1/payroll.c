#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main(int argc, char *argv[]){
    
 char* last_name = argv[1];  // create first cmd line arg
    char* first_name = argv[2]; // creates 2nd cmd line arg
    double mins_worked = atof(argv[3]); // creates 3rd cmd line arg
    double hourly_rate = atof(argv[4]); // creates 4th cmd line arg

    double hrs_worked = mins_worked / 60;   // calculates hrs worked
    double total_payment = hrs_worked * hourly_rate; // calculates payment

    printf("%s %s: %.2f\n", first_name, last_name, total_payment); // prints out first name, last name, and payment
    return 0; 
}
