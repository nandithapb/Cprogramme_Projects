#include <stdio.h>
int main()
{
  int n,i;
  scanf("%d",&n);
  int a[n];  
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  int count=0;
 //for(i=0;i<n;i++)
 //{
 // if(a[i]==0)
    //count++;
 // }
   for(i=0;i<n;i++)
   {
     
       if(a[i]!=0)
       printf("%d ",a[i]);
   }
   for(i=0;i<n;i++)   
   {
   //else
     if(a[i]==0)
      printf("%d ",a[i]);
   }
   return 0;
}