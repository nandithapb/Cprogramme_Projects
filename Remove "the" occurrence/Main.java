#include<stdio.h>
#include<string.h>
int main(){
    char str[100], temp[26];
    gets(str);
    int j= 0;
    for(int i = 0; str[i] != '\0'; i++)
    {
        if((str[i] == 't' || 'T') && str[i + 1] == 'h' && str[i + 2] == 'e')
        {
            i = i + 3;
        }
        else{
            temp[j] = str[i];
            j++;
        }
    }
    temp[j] = '\0';
  //for(int i=0;i<l;i++)
    printf("%s\n", temp);
    return 0;
}