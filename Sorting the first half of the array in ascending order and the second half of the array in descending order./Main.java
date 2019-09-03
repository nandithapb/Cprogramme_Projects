#include<stdio.h>
int main()
{
int n;
  scanf("%d",&n);
  int a[n];
  for (int i=0;i<n;i++)
    scanf("%d",&a[i]);
  int t=n;
  n=n/2;
   for(int i = 0; i <= n; i++)
   {
     for(int j = 0; j<= n-2-i; j++)
     {
       if(a[j] > a[j+1])
       {
         int temp = a[j];
         a[j] = a[j+1];
         a[j+1] = temp;
       }
     }
   }
   for(int i = n; i <= t; i++)
   {
     for(int j = n; j<= t-2; j++)
     {
       if(a[j] < a[j+1])
       {
         int temp = a[j];
         a[j] = a[j+1];
         a[j+1] = temp;
       }
     }
   }
    for(int i=0;i<t;i++)
      printf("%d ",a[i]);
return 0;
}
