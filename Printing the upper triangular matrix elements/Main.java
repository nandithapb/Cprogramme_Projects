#include<stdio.h>
int main()
{
    int r,c;
    scanf("%d %d", &r, &c);
    int matrix[r][c];
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
           scanf("%d", &matrix[i][j]);
        }
    }
        for(int k = 0; k < c; k++)
        {
          int i=0;
              for(int j = k; j < c ; j++)
              {
            printf("%d ", matrix[i][j]);
                i++;
              }
        }
  return 0;
    }