#include <stdio.h>
#include <math.h>
int main() {
    int n, i;
    float sample[100], sum = 0.0, mean, population_mean, std_dev = 0.0, confidence_level, z, margin_of_error, lower_bound, upper_bound;
    printf("Enter number of sample data points: ");
    scanf("%d", &n);
    printf("Enter the sample data:\n");
    for (i = 0; i < n; i++) {
    scanf("%f", &sample[i]);
        sum += sample[i];
    }
    mean = sum / n;
    for (i = 0; i < n; i++) {
        std_dev += (sample[i] - mean) * (sample[i] - mean);
    }
    std_dev = sqrt(std_dev / (n - 1));
    printf("Enter confidence level (e.g., 1.96 for 95%%): ");
    scanf("%f", &z);
    margin_of_error = z * (std_dev / sqrt(n));
    lower_bound = mean - margin_of_error;
    upper_bound = mean + margin_of_error;
    printf("\n--- Results ---\n");
    printf("Sample Mean: %.2f\n", mean);
    printf("Confidence Interval: [%.2f, %.2f]\n", lower_bound, upper_bound);
    return 0;
}
