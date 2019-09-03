#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n==1)
    printf("One");
  else if(n==2)
    printf("Two");
  else if(n==3)
    printf("Three");
  else if(n==4)
    printf("Four");
  else if(n==5)
    printf("Five");
  else
    printf("Invalid");
  
  return 0;
}