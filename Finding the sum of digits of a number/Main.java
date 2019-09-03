#include <stdio.h>
int main() {
	int n,r;
  scanf("%d",&n);
  int sum=0;
  while (n>0)
         {
           r=n%10;
           n = n/10;
           sum =sum+r;
         }
         printf("%d",sum);
	return 0;
}