#include<stdio.h>
int main()
{
  int n,i,j;
  int flag=0;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  int val;
  scanf("%d",&val);
  for(i=0;i<n-1;i++)
  {
    int sum=0;
    for(j=i+1;j<n;j++)
    {
      sum=a[i]+a[j];
     // printf("%d",sum);
      if(val==sum)
      {
        printf("Perfect couple: %d %d",a[i],a[j]);
        flag=1;
      break;
      }
    }
    
  }
  if(flag!=1)
        printf("No perfect couple found!");
  return 0;
}