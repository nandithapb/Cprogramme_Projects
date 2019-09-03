#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    gets(str);
  //int l=strlen(str);
    char x;
    int flag;
    for(int i = 0; str[i] != '\0'; i++)
    {
        flag = 0;
        for(int j = 0; str[j] != '\0'; j++)
        {
            if(str[i] == str[j] && i != j)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            x = str[i];
            break;
        }
    }
    if(flag == 0)
    {
        printf("%c", x);
    }
    else
    {
        printf("All the characters are repetitive");
    }
}