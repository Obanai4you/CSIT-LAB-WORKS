#include <stdio.h>
#include <stdlib.h>
int main() {
    float random_numbers[50] = {0.12, 0.23, 0.34, 0.45, 0.56, 0.67, 0.78, 0.89, 0.91, 0.99, 0.05, 0.15, 0.25, 0.35, 0.46, 0.57, 0.68, 0.79, 0.81, 0.95, 0.02, 0.14, 0.24, 0.36, 0.47, 0.58, 0.69, 0.74, 0.84, 0.94, 0.04, 0.13, 0.22, 0.32, 0.42, 0.52, 0.62, 0.72, 0.82, 0.92, 0.03, 0.11, 0.21, 0.31, 0.41, 0.51, 0.61, 0.71, 0.83, 0.93};
    int i, j; 
    for (i = 0; i < 50 - 1; i++) {
        for (j = 0; j < 50 - i - 1; j++) {
            if (random_numbers[j] > random_numbers[j + 1]) {
                float temp = random_numbers[j];
                random_numbers[j] = random_numbers[j + 1];
                random_numbers[j + 1] = temp;
            }
        }
    }
    float D_plus = 0, D_minus = 0;
    for (i = 0; i < 50; i++) {
        float Dp = ((i + 1) / 50.0) - random_numbers[i];
        float Dm = random_numbers[i] - (i / 50.0);
        if (Dp > D_plus) D_plus = Dp;
        if (Dm > D_minus) D_minus = Dm;
    }
    float D = (D_plus > D_minus) ? D_plus : D_minus;
    printf("D+ = %f\nD- = %f\nD = %f\n", D_plus, D_minus, D);
    return 0;
}
