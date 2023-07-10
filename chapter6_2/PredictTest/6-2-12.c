#include <stdio.h>

int f (int i);

int main(void)
{
    printf("%d %d %d", f(1), f(5), f(-2));
    return 0;
}

int f(int i)
{
    if (i <= 2)
        return 1;
    else
        return f(i - 1) + f(i - 2);
}