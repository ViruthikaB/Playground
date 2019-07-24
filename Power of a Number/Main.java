#include <stdio.h>
#include <math.h>
int main()
{
  	int n,e;
  	scanf("%d %d",&n,&e);
  	if(e<0)
    	printf("Wrong input");
  	else
      	printf("%.0f",pow(n,e));
    return 0;
}