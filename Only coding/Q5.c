#include<stdio.h>
int main()
{
	int i,arr[10],n;
	printf("Enter the size of the array:\n");
	scanf("%d",&n);
	printf("Enter the elements of the array:\n");
	for(i=0;i<n;i++)
	{
		if(i%2==0)
		{
			printf("Enter an odd number:\n");
			scanf("%d",&arr[i]);
		}
	}
	printf("Array in reverse order:\n");
	for(i=n;i>0;--i)
	{
		printf("%d",arr[i]);
	}
	return 0;
}