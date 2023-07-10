#include <stdio.h>

struct student {
    int n, g;
};

int main(void)
{
    struct student st[2];
    int i = 0;
    for (i; i < 2; i++) {
        st[i].n = i;
        st[i].g = i+1;
    }
    printf("%d", st[0].n + st[1].g);
    return 0;
}
