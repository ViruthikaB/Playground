#include<stdio.h>
#include<math.h>
int main()
{
  long int n,fact=1;
  scanf("%ld",&n);
  for(int i=1;i<=n;i++)
    fact*=i;
  printf("%ld",fact);
  return 0;
}