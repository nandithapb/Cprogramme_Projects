#include <stdio.h>
int main() {
	int n,count;
  scanf("%d",&n);
  for(count=1;count<(2*n+1);count++)
  {
    if(count%2==1)
    {
      printf("%d\n",count);
     
    }
  }
	return 0;
}