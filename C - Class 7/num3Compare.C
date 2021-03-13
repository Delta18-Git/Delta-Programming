//VS10
#include <stdio.h>
#include <conio.h>
//By Vinaayak G Dasika and Suraj Premkumar
//On 15/2/19
void main()
{
  int a, b, c;
  printf("Enter a number");
  scanf("%d", &a);
  printf("Enter another number");
  scanf("%d", &b);
  printf("Enter another number");
  scanf("%d", &c);
  if (a > b && a > c)
    printf("%d is the greatest", &a);
  else if (b > a && b > c)
    printf("%d is the greatest", &b);
  else if (c > a && c > b)
    printf("%d is the greatest", &c);
  else
    printf("All the numbers are equal");
  getch();
}