#include <stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int a[n],s[n];
  for(int i=1;i<=n;i++)
  {
    scanf("%d",&a[i]);
    s[i]=i;
    //printf("%d",s[i]);
  }
  for(int i=1;i<=n;i++)
  {
    int flag=0;
    for(int j=1;j<=n;j++)
    {
      if(s[i]==a[j])
         flag++;
    }
    if(flag==0)
      printf("%d",s[i]);
  }
   return 0;
}