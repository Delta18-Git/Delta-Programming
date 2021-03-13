//VS08
#include <stdio.h>
#include <conio.h>
//By Vinaayak G Dasika and Suraj Premkumar
//On 8/2/19
void main()
{
    int a, b;
    clrscr();
    printf("Enter a number to compare.");
    scanf("%d", &a);
    printf("Enter the second number.");
    scanf("%d", &b);
    if (a > b)
        printf("%d is bigger.", a);
    else
        printf(" %d is bigger.", b);
    getch();
}
