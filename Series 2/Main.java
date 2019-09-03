#include <stdio.h>
#include<math.h>

int main() {
//code
int n;
scanf("%d", &n);
if(n % 2 == 1)
{
int x = 2 * ((n+1)/2- 1);
printf("%d", x);
}
else
{
int y = n/2-1;
printf("%d", y);
}

return 0;
}