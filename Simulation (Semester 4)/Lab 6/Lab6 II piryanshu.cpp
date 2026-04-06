#include <stdio.h>
#include <stdlib.h>
int main() {
    int X0 = 13, m = 1000, a = 15;
    int i;
    printf("Multiplicative Congruential Method:\n");
    for (i = 0; i < 50; i++) {
        X0 = (a * X0) % m;
        printf("%d ", X0);
    }
    printf("\n");
    return 0;
}
 