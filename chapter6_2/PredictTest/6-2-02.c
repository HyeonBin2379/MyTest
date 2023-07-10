#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void)
{
    int hist[6] = {0,};
    int n, i = 0;
    srand(time(NULL));

    do {
        n = rand() % 6 + 1;
        hist[n-1] += 1;
        i++;
    } while (i < 10);
    printf("\n");

    for (i = 0; i < 6; i++)
        printf("hist[%d] = %d\n", i, hist[i]);
    return 0;
}