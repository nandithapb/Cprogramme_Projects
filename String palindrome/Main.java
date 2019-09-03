#include <stdio.h>
#include <string.h>
int main()
{
  char str[100],copy[100],rev[100];
  gets(str);
  int len=strlen(str),i;
  int end=len-1;
  for( i=0;i<len;i++)
  {
    rev[i]=str[end];
    end--;
  }
  int a=strcmp(rev,str);
  //printf("%s\n",copy);
    if(a==0)
    {
      printf("%s is a palindrome",str);
    }
    else
    {
      printf("%s is not a palindrome",str);
    }
   return 0;
}