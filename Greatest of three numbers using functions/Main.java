#include <stdio.h>
int greatest(int,int,int);
int main()
{
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
   greatest(a,b,c);
}
int greatest(int a,int b,int c)
{
  if(a>=b)
  {
    if(a>=c)
    printf("%d",a);
    else
      printf("%d",c);
  }
  else
  {
    if(b>=c)
    printf("%d",b);
    else
      printf("%d",c);
  }
}