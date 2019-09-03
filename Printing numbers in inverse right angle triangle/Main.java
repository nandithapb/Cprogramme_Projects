#include <stdio.h>
int main() {
    int n;
  int num;
   scanf("%d",&n);
  num=n;
   for(int r=1;r<=n;r++)
   {  
       for(int c=num;c>0;c--)
       {
       printf("%d",c);
       }
     printf("\n");
     num=num-1;
   }
	return 0;
}