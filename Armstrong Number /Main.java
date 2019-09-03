#include <stdio.h>
#include <math.h>
int main()
{
	int n,n1;
  scanf("%d",&n);
  int count=0,sum=0;
  int copy=n;
  while(n>0)
  {
    n=n/10;
    count++;     
  } 
  n1=copy;
  for(int i=1;i<=count;i++)
  {
    int r=n1%10;
    int p= pow(r,count);
  
     sum=sum+p;
    n1=n1/10;
  } 
 if(sum==copy)
   printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
return 0;
}
