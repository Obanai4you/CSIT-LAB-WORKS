#include <stdio.h>

int main() {
    float P_pepsi_to_coke = 0.20;
    float P_pepsi_to_pepsi = 0.80;
    float P_coke_to_coke = 0.90;
    float P_coke_to_pepsi = 0.10;

    float probability_coke_after_two_purchases;

    probability_coke_after_two_purchases = 
        (P_pepsi_to_coke * P_coke_to_coke) + 
        (P_pepsi_to_pepsi * P_pepsi_to_coke);

    printf("Probability of purchasing Coke after two purchases, given current Pepsi purchase: %.4f\n", probability_coke_after_two_purchases);

    return 0;
}
