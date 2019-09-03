#include<stdio.h>
int main()
{
  
        int n;
        scanf("%d",&n);
        int a[n];
        for(int i = 0; i < n; i++)
        {
            scanf("%d",&a[i]);
        }
	//tatic isnt mostFrequent(int arr[], int n, int freq[]) 
	//{ 
	    int max = 0; 
		int count = 1; 
		int s[n];
	    for(int i = 0; i < n; i++)
	    {
		    for (int j = i+1; j < n; j++) 
		    { 
	            if(a[i] == a[j])
	            count ++;
		    }
		    s[i] = count;
		    count = 1;
	    } 
	    for( int i = 0; i < n; i++)
	    {
            if(s[i]>s[max])
            max = i;
	    }
	    printf("%d",a[max]);
	
		return 0;
}