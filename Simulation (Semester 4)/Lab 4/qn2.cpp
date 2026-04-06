#include <stdio.h>

int main() { 
    int arrival_rate = 1; 
    int ticket_purchase_time = 20; 
    float seat_time = 1.5; 
 
    float ticket_purchase_time_in_minutes = (float)ticket_purchase_time / 60;
    float total_time = ticket_purchase_time_in_minutes + seat_time;
    printf("Total time spent by the fan: %.2f minutes\n", total_time);
    float time_before_kickoff = 2.0;
    if (total_time <= time_before_kickoff) {
        printf("The fan will be seated in time for the kick-off.\n");
    } else {
        printf("The fan will not be seated in time for the kick-off.\n");
    }

    return 0;
}
