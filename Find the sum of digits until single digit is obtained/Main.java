#include<stdio.h>
int main()
{
	int x;
	
	//printf("Enter an integer number: ");
	scanf("%d",&x);
	
	if(x==0)
		printf("%d",0);
	else if(x%9==0)
		printf("%d",9);
	else
		printf("%d",x%9);
	
	
	printf("\n");
	return 0;
}

