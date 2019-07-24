#include<stdio.h>
#include<math.h>
int main()
{
  float x,y;
  scanf("%f %f",&x,&y);
  float h=sqrt((x*x)+(y*y));
  printf("%.2f",h);
  return 0;
}