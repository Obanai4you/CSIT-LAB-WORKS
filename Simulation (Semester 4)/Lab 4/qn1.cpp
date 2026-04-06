#include <stdio.h>

int main() {
    double lambda = 1.0 / 10.0;  
    double mu = 1.0 / 5.0;       
    double rho = lambda / mu;
    double P0 = 1 - rho;
    double L = rho / (1 - rho);
    double W = 1 / (mu - lambda);
    printf("Probability that a customer will not have to wait: %.2f\n", P0);
    printf("Expected number of customers in the bank: %.2f\n", L);
    printf("Time a customer expects to spend in the bank: %.2f minutes\n", W);

    return 0;
}
