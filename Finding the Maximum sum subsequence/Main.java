#include<stdio.h>
int main()
{
  int n;
        scanf("%d",&n);
        int a[20];
        int i, j;
        for(i=0; i<n; i++)
        {
            scanf("%d",&a[i]);
        }
  
 	    int temp = a[0];
  	    int sum = a[0];
  	    for(int i = 1; i < n; i++)
        {
            if(a[i] > a[i-1])
            {
                temp=temp+a[i];
            }
            else 
            {
                temp = a[i];
            }
            if(temp> sum)
            {
                sum= temp;
            }
        }
  printf("%d",sum);
  return 0;
}