#include <stdio.h>
int main() 
{
  int n;
  scanf("%d",&n);
  int count=0;
  int sum=0;
  int copy=n;
  int fact=1;
  while(n>0)
  {
    n=n/10;
    count++; 
   // printf("%d\n",count);
  } 
  n=copy;
  for(int i=1;i<=count;i++)
  {
    int r=n%10;
    fact=1;
    for(int j=1;j<=r;j++)
     fact=fact*j;
    sum=sum+fact;
    n=n/10;
  } 
 if(sum==copy)
   printf("Yes");
  else
    printf("No");
	return 0;
}