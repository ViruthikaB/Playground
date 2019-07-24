#include<stdio.h>
#include<math.h>
int main()
{
  int dia;
  scanf("%d",&dia);
  float rad = (float)(dia)/2;
  float area = 3.14 * rad * rad;
  printf("%0.2f",area);
  return 0;
}