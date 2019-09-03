#include<stdio.h>
int sum(int n);
int main()
{
  int n;
  scanf("%d",&n);
  int x=sum(n);
  printf("%d",x);
}
int sum(int a)
{
  if(a==0)
  {
    //printf("0");  
    return 0;
  }
  else
  {
    int x=a+sum(a-1);
   //return a+sum(a-1);
      return x;
  }
}