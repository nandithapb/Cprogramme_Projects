#include<stdio.h>
int main()
{
        int n;
        scanf("%d",&n);
        int k;
        scanf("%d",&k);
        int a[10];
        for(int i = 0; i <= n - 1; i++)
        {
            scanf("%d",&a[i]);
        }
        int s[k];
        for(int i = 0; i <= k - 1; i++)
        {
            s[i] = 0;
        }
        for(int i = 0; i <= n - 1; i++)
        {
           s[a[i] - 1]=s[a[i] - 1]+1;
        }
        for(int i= 0; i<= k - 1; i++)
        {
           printf("%d %d\n",(i+ 1),s[i]);
        }
    return 0;
}