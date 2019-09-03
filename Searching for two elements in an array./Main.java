#include<stdio.h>
int main()
{
   int n,arr[n];
  scanf("%d",&n);
  for(int i=0;i<=n-1;i++)
    scanf("%d",&arr[i]);
  int e1,e2;
  int x=-1,y=-1;
  scanf("%d %d",&e1,&e2);
  for(int i=0;i<=n-1;i++)
  { 
  if(arr[i]==e1)
     x=i;
      //printf("%d\n",x); 
  else if(arr[i]==e2)
   y=i;
  } 
 printf("%d\n",x);
  printf("%d",y);
   return 0;
}