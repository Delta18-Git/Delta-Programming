//VS15
#include <stdio.h>
#include <conio.h>
//By Vinaayak G Dasika and Suraj Premkumar
//On 4/3/19
void main()
{
  int n, i;
  clrscr();
  printf("Enter a number.");
  scanf("%d", &n);
  for (i = 1; i <= n; i++)
    printf("\t %d", i);
  getch();
}