#include <stdio.h>
int main() {
int n,c,r;
  scanf("%d",&n);
  for(r=1;r<=n;r++)
  {
    for(c=1;c<=n;c++)
    {
      if(r%2==1)
      { 
        if(c!=n)
        printf("%d",r);
        else
        printf("%d",r+1);
      }
      else
      {
        if(c==1)
        printf("%d",r+1);
        else
        printf("%d",r);
      }
    }
    printf("\n");
  }
	return 0;
}