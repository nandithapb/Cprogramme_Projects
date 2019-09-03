#include <stdio.h>
int power(int,int);
int main()
{
  int b,e;
  scanf("%d %d",&b,&e);
   power(b,e);
}
int power(int base,int exponent)
{
  int pow=base;
  for(int i=1;i<exponent;i++)
  {
    pow=pow*base;   
  }
  printf("%d",pow);
}