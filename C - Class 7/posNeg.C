//VS07
#include <stdio.h>
#include <conio.h>
//By Vinaayak G Dasika and Suraj Premkumar]
//on 8/2/19
void main()
{
     clrscr();
     int no;
     printf("Please enter a number to test for positivity or negativity.\n");
     scanf("%d", &no);
     if (no < 0)
          printf("%d is negative", no);
     else if (no == 0)
          printf("%d is zero", no);
     else
          printf("%d is positive", no);
     getch();
}
