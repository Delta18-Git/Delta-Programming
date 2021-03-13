#include <stdio.h>
#include <conio.h>
void main()
{
    int r = 11;
    int x;
    clrscr();
    printf("Welcome to Vinaayak's Test of Smartness.\n");
    printf("Enter the answer to the following problem.\n");
    printf("What is 1+1?\n");
    scanf("%d", &x);
    if (x == 99)
    {
        printf("You are smart");
    }
    else if (x == r)
    {
        printf("Your IQ is medium.");
    }
    else if (x == 2)
    {
        printf("You are exceptionally dumb.");
    }
    else
    {
        printf("You are dumb.");
    }
    getch();
}