#include<stdio.h>
int main()
{
	int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(int i=0;i<n;i++)
  {
    for(int j=i;j<n;j++)
    {
      if(a[i]<a[j])
        printf("%d,%d\n",a[i],a[j]);
     
    }
    
   }
  return 0;
}