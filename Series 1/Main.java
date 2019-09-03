#include <stdio.h>
#include<math.h>

int main()
{
int n;
scanf("%d", &n);
if(n % 2 == 1)
{
//int a = 1;
//int r = 2;
//int term_in_series = (n+1)/2;
int n1 = pow(2, (n+1)/2-1);
printf("%d ", n1);
}
else
{
//int a = 1;
//int r = 3;
//int term_in_series = n/2;
int n2 = pow(3, n/2 - 1);
printf("%d ", n2);
}

return 0;
}