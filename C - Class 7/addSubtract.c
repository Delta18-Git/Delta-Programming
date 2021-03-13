//VS02
#include <conio.h>
#include <stdio.h>
// A program to add and subtract 2 nos.
// By Vinaayak G Dasika and Suraj Premkumar
// On 24/11/18
void main()
{
    clrscr();
    int a, b;
    printf("Welcome to the Adder and Subtractor!\n");
    printf("Enter the first number.\n");
    scanf("%d", &a);
    printf("Enter the second number.\n");
    scanf("%d", &b);
    printf("The sum of the two numbers entered is %d.\n", a + b);
    printf("The difference between the two numbers entered is %d.\n", a - b);
    printf("Press any key to exit the program.");
    getch();
}