#include <stdio.h>

int fn(int a)
{
    if (a <= 1) {
        return 1;
    }

    return a * fn(a-1);
}

int main(void)
{
    int a;
    scanf("%d", &a);
    printf("%d", fn(a));
    return 0;
}