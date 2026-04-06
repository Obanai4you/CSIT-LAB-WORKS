#include <stdio.h>
#include <stdlib.h>

int main() {
    int random_numbers[50] = {123, 234, 345, 456, 567, 678, 789, 890, 901, 999,
                              105, 215, 325, 435, 546, 657, 768, 879, 981, 995,
                              202, 314, 424, 536, 647, 758, 869, 974, 884, 994,
                              104, 213, 322, 432, 542, 652, 762, 872, 982, 992,
                              302, 411, 521, 631, 741, 851, 961, 771, 881, 991};
    int i, j, digit_count[10], pair = 0, triple = 0, no_match = 0;

    for (i = 0; i < 50; i++) {
        for (j = 0; j < 10; j++) {
            digit_count[j] = 0;
        }
        
        int num = random_numbers[i];
        while (num > 0) {
            digit_count[num % 10]++;
            num /= 10;
        }
        
        int has_pair = 0, has_triple = 0;
        for (j = 0; j < 10; j++) {
            if (digit_count[j] == 2) has_pair = 1;
            if (digit_count[j] == 3) has_triple = 1;
        }
        
        if (has_triple) triple++;
        else if (has_pair) pair++;
        else no_match++;
    }
    
    printf("Poker Test Results:\n");
    printf("Pairs: %d\n", pair);
    printf("Triples: %d\n", triple);
    printf("No Matches: %d\n", no_match);
    
    return 0;
}
