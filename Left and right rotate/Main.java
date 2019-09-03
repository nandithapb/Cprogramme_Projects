#include <stdio.h>
int main()
{
  int n,r,i,temp1,temp2,ei,oi,j;
  scanf("%d",&n);
  int a[n];  
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d",&r);
  //if(n%2==0) 
  //oi=n-2;
  //else
    //ei=n-1;
  oi = (n%2 == 0)? n-2:n-1;
     ei =(n%2 == 0)? n - 1: n-2 ;
  for(i=0;i<r;i++)
  {
    //odd
    temp1=a[oi];
    for(j=oi;j>=0;j=j-2)
    {
      a[j]=a[j-2];
    }
    a[0]=temp1;
    //even
    temp2=a[1];
    for(j=1;j<=n;j=j+2)
    {
      a[j]=a[j+2];
    }
    a[ei]=temp2;
   }
  for(i=0;i<n;i++)
    printf("%d ",a[i]);
   return 0;
}