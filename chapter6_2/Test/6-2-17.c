#include <stdio.h>

int calc(int w, int h, int j, int i)
{
    if (i >= 0 && i < h && j >= 0 && j < w) {
        return 1;
    }
    return 0;
}
void print(int (*arr)[4], int w, int h, int *count)
{
    int l, k;

    (*count)++;
    printf("%d번째 시도\n", *count);
    for (l = 0; l < h; l++)
    {
        for (k = 0; k < w; k++)
        {
            printf("%d ", arr[l][k]);
        }
        printf("\n");
    }
    printf("\n");
}

int main(void)
{
    int field[4][4] = {{0, 1, 0, 1}, {0, 0, 0, 1}, {1, 1, 1, 0}, {0, 1, 1, 1}};
    int mines[4][4] = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
    int w = 4, h = 4;
    int i, j, k, l;
    int count = 0;

    for (l = 0; l < h; l++)
    {
        for (k = 0; k < w; k++)
        {
            if (field[l][k] == 0)
                continue;
            
            for (i = l-1; i <= l+1; i++)
            {
                for (j = k-1; j <= k+1; j++)
                {
                    if (calc(w, h, j, i) == 1)
                    {
                        mines[i][j] += 1;
                    }
                }
            }

            print(mines, w, h, &count);
        }
    }
    
    return 0;
}