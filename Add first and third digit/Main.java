//header
#include<stdio.h>
//main function
int main()
{
  //variable declarations
  int n,a,b;
  //scanning function
  scanf("%d %d",&n);
  a=n/100;
  b=n%10;
  a=a+b;
  //printing function
  printf("%d",a);
  return 0;
}
