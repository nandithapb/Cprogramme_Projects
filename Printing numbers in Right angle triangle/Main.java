#include <stdio.h>
int main(){
  	int n;
    scanf("%d",&n);
    for(int r=1;r<=n;r++)
    {
        for(int c=1;c<=r;c++)
        {
            if(n%2==1)
            printf("%d",r);
            else
            printf("%d",r);
        }
        printf("\n");
    }

	return 0;
}