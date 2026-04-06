#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

// Function representing the curve f(x) = x^2 (you can change this to any function)
double f(double x) {
    return x * x;  // Example: f(x) = x^2
}

// Function to estimate the area under the curve using Monte Carlo simulation
double estimate_area(double a, double b, int num_points) {
    int points_under_curve = 0;
    
    // Find the maximum value of the function in the range [a, b]
    double max_y = f(b);  // The maximum value of f(x) in the range [a, b] is at b (since x^2 is increasing)
    
    // Seed for random number generation
    srand(time(NULL));

    // Generate random points and check if they fall under the curve
    for (int i = 0; i < num_points; i++) {
        // Random x value between a and b
        double x = a + (b - a) * ((double)rand() / RAND_MAX);
        
        // Random y value between 0 and max_y
        double y = (double)rand() / RAND_MAX * max_y;
        
        // Check if the point (x, y) is under the curve f(x)
        if (y <= f(x)) {
            points_under_curve++;
        }
    }

    // Estimate the area under the curve
    double area = (b - a) * max_y * ((double)points_under_curve / num_points);
    return area;
}

int main() {
    double a, b;
    int num_points;

    // Get input from user
    printf("Enter the interval [a, b] to estimate the area under the curve: ");
    scanf("%lf %lf", &a, &b);
    
    printf("Enter the number of random points: ");
    scanf("%d", &num_points);

    // Estimate the area
    double area = estimate_area(a, b, num_points);

    // Print the estimated area
    printf("Estimated area under the curve: %lf\n", area);

    return 0;
}
