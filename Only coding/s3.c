#include<stdio.h>
int main()
{
	char *x="String";
	char y[]="add";
	char *z;
	z=(char*)malloc(sizeof(x)+sizeof(z)=1);
	strcpy(z,y);
	strcat(z,y);
	printf("%s+%s=%s",y,x,z);
}