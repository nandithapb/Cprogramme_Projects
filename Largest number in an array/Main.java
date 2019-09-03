#include <stdio.h>
int main()
{
   int n,arr[n];
  scanf("%d",&n);
  for(int i=0;i<=n-1;i++)
    scanf("%d",&arr[i]);
  int max=0;
  for(int i=0;i<=n-1;i++)
  { 
    if(arr[i]>=arr[i+1])
    {
      max=arr[i];
    break;
    }
    else
      max=arr[i+1];
  }   
  printf("%d",max); 
   return 0;
}