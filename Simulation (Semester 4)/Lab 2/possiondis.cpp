#include <stdio.h>
#include <math.h>

// Function to calculate factorial of a number
long long factorial(int n) {
    long long fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}

// Function to calculate Poisson distribution
double poisson(int x, double lambda) {
    return (pow(lambda, x) * exp(-lambda)) / factorial(x);
}

int main() {
    double lambda = 12.0; // Average rate of arrival (12 cars per hour)
    int max_x = 15; // Maximum value of x (from 0 to 15)
    
    printf("Poisson Distribution (? = %.2f):\n", lambda);
    printf("x\tP(x)\n");
    for (int x = 0; x <= max_x; x++) {
        double result = poisson(x, lambda);
        printf("%d\t%.6f\n", x, result);
    }

    return 0;
}
