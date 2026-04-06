#include <stdio.h>

int main() {
    float lambda, mu;
    float rho, L, Lq, W, Wq;

    printf("Enter the Arrival Rate (lambda): ");
    scanf("%f", &lambda);

    printf("Enter the Service Rate (mu): ");
    scanf("%f", &mu);

    if (mu <= lambda) {
        printf("The system is unstable! Service rate must be greater than arrival rate.\n");
        return 0;
    }

    rho = lambda / mu;
    L = lambda / (mu - lambda);
    Lq = (lambda * lambda) / (mu * (mu - lambda));
    W = 1 / (mu - lambda);
    Wq = lambda / (mu * (mu - lambda));

    printf("\nM/M/1 Queue Performance Measures:\n");
    printf("Traffic Intensity (rho): %.4f\n", rho);
    printf("Average number of customers in the system (L): %.4f\n", L);
    printf("Average number of customers in the queue (Lq): %.4f\n", Lq);
    printf("Average time a customer spends in the system (W): %.4f\n", W);
    printf("Average time a customer spends in the queue (Wq): %.4f\n", Wq);

    return 0;
}
