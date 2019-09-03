#include<stdio.h>
int main()
{
  int r,c;
  scanf("%d%d",&r,&c);
  int a1[r][c],a2[r][c],sum[r][c];
  for( int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",&a1[i][j]);
    }
  }
  for( int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",&a2[i][j]);
    }
  }
    for( int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      sum[i][j]=a1[i][j]-a2[i][j];
    }
  }
  for( int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      printf("%d ",sum[i][j]);
    }
    printf("\n");
  }
return 0;
}
