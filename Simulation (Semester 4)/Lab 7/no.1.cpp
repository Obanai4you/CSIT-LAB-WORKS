#include <stdio.h>
#include <stdlib.h>
int main() {
    float random_numbers[50] = {0.12, 0.23, 0.34, 0.45, 0.56, 0.67, 0.78, 0.89, 0.91, 0.99, 0.05, 0.15, 0.25, 0.35, 0.46, 0.57, 0.68, 0.79, 0.81, 0.95, 0.02, 0.14, 0.24, 0.36, 0.47, 0.58, 0.69, 0.74, 0.84, 0.94, 0.04, 0.13, 0.22, 0.32, 0.42, 0.52, 0.62, 0.72, 0.82, 0.92, 0.03, 0.11, 0.21, 0.31, 0.41, 0.51, 0.61, 0.71, 0.83, 0.93};
    int i, d = 3; // d is lag value
    float mean = 0, numerator = 0, denominator = 0, auto_corr;
    for (i = 0; i < 50; i++) {
        mean += random_numbers[i];
    }
    mean /= 50;
    for (i = 0; i < 50 - d; i++) {
        numerator += (random_numbers[i] - mean) * (random_numbers[i + d] - mean);
    }
    for (i = 0; i < 50; i++) {
        denominator += (random_numbers[i] - mean) * (random_numbers[i] - mean);
    }
    auto_corr = numerator / denominator;
    
    printf("Auto-Correlation Coefficient: %f\n", auto_corr);
    return 0;
}
