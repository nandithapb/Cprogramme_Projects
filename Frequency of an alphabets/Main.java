#include<stdio.h>
#include<string.h>
int main()
{
  char s[100],start[26];
  gets(s);
  int l=strlen(s);
  for(int i=0;i<=25;i++)
    start[i]=0;
  for(int i=0;i<=l;i++)
  {
    if(s[i]>='a' && s[i]<='z')
    {
      int a=s[i]-'a';
      start[a]++;
    }
    if(s[i]>='A' && s[i]<='Z')
    {
      int a=s[i]-'A';
      start[a]++;
    }
  }
  for(int i=0;i<=25;i++)
  {
    if(start[i]!=0)
    {
      int let=i+'a';
      printf("%c%d ",let,start[i]);
    }
  }
  return 0;
}