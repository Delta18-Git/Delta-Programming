//VS04
#include <stdio.h>
#include <conio.h>
//A program to add and subtract 2 nos.
//By Vinaayak G Dasika and Suraj Premkumar
//On 24/11/18
void main()
{
    double a, b;
    clrscr();
    printf("Welcome to the Adder, Subtractor, Multiplier and Divider!\n");
    printf("Enter the first decimal number.\n");
    scanf("%lf", &a);
    printf("Enter the second decimal number.\n");
    scanf("%lf", &b);
    printf("The sum of the two numbers entered is %lf.\n", a + b);
    printf("The difference between the two numbers entered is %lf.\n", a - b);
    printf("The product of the two numbers is %lf.\n", a * b);
    printf("The quotient of the two numbers is %lf.\n", a / b);
    printf("Press any key to exit the program.");
    getch();
}