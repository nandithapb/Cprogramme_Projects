#include <stdio.h>
int main()
{
    int r,c,flag=0;
    scanf("%d %d", &r, &c);
    int a1[r][c],a2[r][c];;
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
           scanf("%d", &a1[i][j]);
        }
    }
    
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
           scanf("%d", &a2[i][j]);
        }
    }
  
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
        {
           if(a1[i][j] != a2[i][j])
           {
                flag =1 ;
                break;
           }
       }
    }
    if(flag == 0)
       printf("Yes");
    else
       printf("No");
}