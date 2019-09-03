#include <stdio.h>
int main() 
{
  int n,last,sum;
  scanf("%d",&n);
  last=n%10;
  while(n>=10)
    n=n/10;
  sum=last+n;
  printf("%d",sum);
	return 0;
}