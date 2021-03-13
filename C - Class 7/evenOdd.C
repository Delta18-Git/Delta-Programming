//VS09
#include <stdio.h>
#include <conio.h>
//By Vinaayak G Dasika and Suraj Premkumar
//On 15/2/19
void main()
{
  clrscr();
  int a;
  printf("Enter a number to check for even or odd\n");
  scanf("%d", &a);
  if (a % 2 == 0)
    printf("%d is even", a);
  else
    printf("%d is odd", a);
  getch();
}