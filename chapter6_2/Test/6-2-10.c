#include <stdio.h>

struct Soojebi
{
    char name[20];
    int os, db, hab1, hab2;
};

int main(void)
{
    struct Soojebi s[3] = {{"데이터1", 95, 88}, 
                    {"데이터2", 84, 91}, 
                    {"데이터3", 86, 75}};
    struct Soojebi *p;
    p = &s[0];
    (p+1)->hab1 = (p+1)->db + (p+2)->os;
    (p+1)->hab2 = (p+1)->hab1 + p->os + p->db;
    printf("%d\n", (p+1)->hab1 + (p+1)->hab2);
}