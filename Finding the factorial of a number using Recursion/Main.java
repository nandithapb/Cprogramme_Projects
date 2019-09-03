#include<stdio.h>
int fact(int n);
int main()
{
  int n;
  scanf("%d",&n);
  int x=fact(n);
  printf("%d",x);
}
int fact(int a)
{
  if(a==1)
  {
    //printf("0");  
    return 1;
  }
  else
  {
    int x=a*fact(a-1);
   //return a+sum(a-1);
      return x;
  }
}