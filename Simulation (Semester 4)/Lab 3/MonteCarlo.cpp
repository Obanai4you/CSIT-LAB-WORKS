#include <stdio.h>
#include <stdlib.h>
#include <time.h>


double estimate_pi(int num_points) {
    int points_inside_circle = 0;
    srand(time(NULL));

    // Generate random points
    for (int i = 0; i < num_points; i++) {
        double x = (double)rand() / RAND_MAX * 2 - 1;
        double y = (double)rand() / RAND_MAX * 2 - 1;

        if (x * x + y * y <= 1) {
            points_inside_circle++;
        }
    }
    return 4.0 * points_inside_circle / num_points;
}

int main() {
    int num_points;

    printf("Enter the number of random points for the simulation: ");
    scanf("%d", &num_points);

    double pi = estimate_pi(num_points);

    printf("Estimated value of Pi: %lf\n", pi);

    return 0;
}
