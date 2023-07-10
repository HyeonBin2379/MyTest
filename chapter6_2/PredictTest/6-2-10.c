#include <stdio.h>

int fn(char* a)
{
    int i = 0;
    for (i = 0; a[i] != '\0'; i++);
    return i;
}

int main(void)
{
    char a[] = "Hello";
    printf("%d", fn(a));
    return 0;
}