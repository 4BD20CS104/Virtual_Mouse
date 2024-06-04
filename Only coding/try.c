#include<stdio.h>

int main()
{
    int a;
    scanf("%d",&a);
    while(a>=1)
    {
            
    if(a%2==0)
    {
              printf("It is even\n");
              }
    else
    {
        printf("It is odd\n");
        }
         printf("%d-",--a);
              }
    getch();
    return 0;
}

    
