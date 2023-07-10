#include <stdio.h>

int main()
{
    int ary[3] = {1};
    int s = 0;
    int i = 0;

    ary[1] = *(ary+0)+2;
    ary[2] = *ary + 3;
    for (i = 0; i < 3; i++) {
        s = s + ary[i];
    }

    printf("%d", s);
    return 0;
}