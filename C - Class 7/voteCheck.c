//VS06
#include <stdio.h>
#include <conio.h>
//By Vinaayak G Dasika and Suraj Premkumar
//On 8/2/19
void main()
{
    clrscr();
    int age;
    printf("Enter your age to test eligibility for voting.");
    scanf("%d", &age);
    if (age >= 18)
    {
        printf("You are eligible to vote.");
    }

    else
        printf("You are not eligible to vote.");
    getch();
}
