#include <stdio.h>
int square(int);
int main()
{
  int a;
  scanf("%d",&a);
  square(a);
   return 0;
}
int square(int a)
{
  int s=a*a;
  printf("%d",s);
}