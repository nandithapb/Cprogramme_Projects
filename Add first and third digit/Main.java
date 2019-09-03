#include<stdio.h>
int main()
{
  int n,a,b;
  scanf("%d %d",&n);
  a=n/100;
  b=n%10;
  a=a+b;
  printf("%d",a);
  return 0;
}