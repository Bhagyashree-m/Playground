#include<stdio.h>
int main()
{
  int n,ld,fd;
  scanf("%d",&n);
  fd=n/10;
  ld=n%10;
  printf("%d",fd+ld);
  
  return 0;
}