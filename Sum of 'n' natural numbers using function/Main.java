
    #include <stdio.h>
int sum(int);
int main()
{
  int n;
  scanf("%d",&n);
  sum(n);
}
int sum(int n)
{
 
  int s=(n*(n+1)/2);
  printf("%d",s);
}
