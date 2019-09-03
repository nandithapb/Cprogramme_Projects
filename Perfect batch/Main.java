#include<stdio.h>
int main()
{
   int n,a[n];
  scanf("%d",&n);
  for(int i=0;i<=n-1;i++)
  {
    scanf("%d",&a[i]);
  }
  int s1=0;
  for(int i=0;i<=n/2;i++)
  {
    s1=s1+a[i];
  }
//printf("%d",s1);
  
  int s2=0;
  for(int j=n/2;j<n;j++)
  {
    s2=s2+a[j];
  }
  if(s1==s2)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
   return 0;
}
