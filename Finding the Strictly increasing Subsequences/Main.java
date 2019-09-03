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
    int flag=0;
    for(int j=i;j<n;j++)
    {
      if(a[i]<a[j])
      {
        for (int k=i;k<=j;k++)
        {
          if (a[k]>a[j])
            flag=1;
        }
        if (flag==0)
          printf("%d,%d\n",a[i],a[j]);
      }
      flag=0;
        }
        
     
    }
    
   
  return 0;
}