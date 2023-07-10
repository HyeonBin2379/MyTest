#include <stdio.h>

int main(void)
{
    int i, cnt = 0;
    int arr[5];

    for (i = 0; i < 5; i++)
    {
        scanf("%d", &arr[i]);
    }
    for (i = 0; i < 5; i++)
    {
        if (arr[i] % 2 == 0)
            cnt = cnt + 1;
    }
    printf("%d\n", cnt);
    return 0;
}