#include<stdio.h>
int main()
{
  float r,ang;
  scanf("%f %f",&r,&ang);
  float arc=2*3.14*r*(ang/360);
  printf("%.2f",arc);
  return 0;
}