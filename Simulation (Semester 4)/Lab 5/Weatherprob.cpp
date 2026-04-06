#include <stdio.h>

int main() {
    float P_rainy_tom_not_rainy_today = 0.20;   
    float P_not_rainy_tom_not_rainy_today = 0.80; 

    float P_not_rainy_day_after_tom_rainy_tom = 0.60;  
    float P_not_rainy_day_after_tom_not_rainy_tom = 0.80; 
    float P_not_rainy_day_after_tom;
    P_not_rainy_day_after_tom = 
        (P_rainy_tom_not_rainy_today * P_not_rainy_day_after_tom_rainy_tom)  +
        (P_not_rainy_tom_not_rainy_today *
         P_not_rainy_day_after_tom_not_rainy_tom);

    printf("P(not rainy day after tomorrow | not rainy today): %.4f\n",
    P_not_rainy_day_after_tom);
    return 0;
}

