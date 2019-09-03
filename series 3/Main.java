#include <stdio.h>

int main()
{
  int n;
scanf("%d", &n);
if(n == 1)
{
printf("1");
}
else if(n ==2)
{
printf("2");
}
 else
{
int t1=1, t2=2, sum; 
for(int i = 3; i <=n; i++)
{
sum = t1 + t2;
  t1 = t2;
t2 =sum ;
}
printf("%d",sum);
}
return 0;
}