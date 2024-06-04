#include<stdio.h>
 void sum(int *a,int *b)
{
	*a=20,*b=30;
	printf("You are right\n");
}
int main()
{
	int x=5,y=10;
	int *p,*q;
	
	p=&x;
	q=&y;
	sum(&x,&y);
	printf("The pointer value is:%d\n",*p**q);
	return 0;
}
