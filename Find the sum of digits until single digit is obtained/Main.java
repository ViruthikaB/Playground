#include<stdio.h>
int main()
{
  int n,sum;
  scanf("%d",&n);
  sum=add(n);
  printf("%d",sum);
}
int add(int n)
{
  int sum=0;
   while(n!=0)
    {
      int temp=n%10;
      sum+=temp;
      n/=10;
    }
    if(sum>9)
      sum=add(sum);
    return sum;
}