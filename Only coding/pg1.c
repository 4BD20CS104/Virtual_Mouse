#include <stdio.h>

int main(){
	int num,T,K,a[100000];
	scanf("%d", &num);              	                  // Reading input from STDIN
      // Writing output to STDOUT
	for(int i=0;i<num;i++)
	{
	scanf("%d\t%d",&T,&K);
	for(int i=0;i<T;i++)
		scanf("%d",&a[i]);
	while(K)
	{
		int temp=a[T-1];
		for(int i=T-1;i>0;i--)
			a[i]=a[i-1];
			a[0]=temp;
	K--;
	}
	for(int i=0;i<T;i++)
		printf("%d ",a[i]);
		printf("\n");
}
}
	