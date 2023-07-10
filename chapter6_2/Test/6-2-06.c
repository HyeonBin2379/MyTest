#include <stdio.h>

struct Soojebi {
    char name[10];
    int age;
};

void main()
{
    struct Soojebi s[] = {"Kim", 28, "Lee", 38, 
                          "Seo", 50, "Park", 35};
    
    struct Soojebi *p;
    p = s;
    p++;

    printf("%s\n", p->name);
    printf("%d\n", p->age);
}