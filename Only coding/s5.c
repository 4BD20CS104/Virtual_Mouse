#include<stdio.h>
#include<conio.h>
int n;
int top[100];
int i;
void push(int s)
{
for(i=0;i<n;i++)
{
	top[i]=s;
}
}
int pop(int i)
{
	return top[i--];
}
int main(void)
{
	int t;
	printf("Enter value of n\n");
	scanf("%d",&n);
	printf("Enter the values in p\n");
for(i=0;i<n;i++)
{
	scanf("%d",&top[i]);
}
for(i=0;i<n;i++)
{
	if(top[i]>=5)
		push(top[i]);
	else
		 top[i]=pop(i);

}
printf("Success\n");
for(i=0;i<n;i++)
	printf("%d\n",top[i]);
return 0;
}