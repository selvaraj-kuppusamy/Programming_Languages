#include<stdio.h>
int main()
{
	int n,k;
	scanf("%d%d",&n,&k);
	printf("%d\n%d\n%d\n",n&k,n|k,n^k);
	return 0;
}
