#include<stdio.h> 
void towerOfHanoi(int n,char fromRod,char toRod,char auxRod)  

{
if(n==1)
{
        printf("\n\n\t Move disk 1 from rod %c to rod %c\n",fromRod,toRod);
        return;
        }
towerOfHanoi(n-1,fromRod,auxRod,toRod);
printf("\n\t\tMove disk %d from rod %c to rod %c\n",n,fromRod,toRod);
towerOfHanoi(n-1,auxRod,toRod,fromRod);
}
int main()
{
    int n;
    system("cls");
    printf("\n\nEnter the no. of disk(s):?\b");
    scanf("%d",&n);
    printf("\n\n\t\tTower of Hanoi Demonstration\n\n");
    towerOfHanoi(n,'A','C','B');
    printf("\n\n");
    getch();
    return 0;
}
