#include <stdio.h>
#include <stdlib.h>
int main() {
    int X0 = 11, m = 100, a = 5, c = 13;
    int i;
    printf("Mixed Congruential Method:\n");
    for (i = 0; i < 50; i++) {
        X0 = (a * X0 + c) % m;
        printf("%d ", X0);
    }
    printf("\n");
    return 0;
}
