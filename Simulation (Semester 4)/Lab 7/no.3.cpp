#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main() {
    int observed_frequencies[10] = {0};
    float expected_frequency = 5.0; // For uniform distribution with 50 numbers across 10 bins
    int i;
    float chi_square = 0;   
    int random_numbers[50] = {12, 23, 34, 45, 56, 67, 78, 89, 91, 99,
                              5, 15, 25, 35, 46, 57, 68, 79, 81, 95,
                              2, 14, 24, 36, 47, 58, 69, 74, 84, 94,
                              4, 13, 22, 32, 42, 52, 62, 72, 82, 92,
                              3, 11, 21, 31, 41, 51, 61, 71, 83, 93};                         
 for (i = 0; i < 50; i++) {
    observed_frequencies[random_numbers[i] / 10]++;
   }
    for (i = 0; i < 10; i++) {
 chi_square += pow(observed_frequencies[i] - expected_frequency, 2) / expected_frequency;
    }
    printf("Chi-Square Test Statistic: %f\n", chi_square);
    return 0;
}
