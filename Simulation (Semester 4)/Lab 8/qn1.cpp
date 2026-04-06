#include <stdio.h>
int main() {
    int n, i;
    float sample[100], sum = 0.0, sample_mean, population_mean, bias;
    printf("Enter number of sample data points: ");
    scanf("%d", &n);
    printf("Enter the sample data:\n");
    for (i = 0; i < n; i++) {
        printf("Sample[%d]: ", i + 1);
        scanf("%f", &sample[i]);
        sum += sample[i];
    }
    printf("Enter the population mean: ");
    scanf("%f", &population_mean);
    sample_mean = sum / n;
    bias = sample_mean - population_mean;
    printf("\n--- Results ---\n");
    printf("Sample Mean (Point Estimation): %.2f\n", sample_mean);
    printf("Bias: %.2f\n", bias);
    return 0;
}
