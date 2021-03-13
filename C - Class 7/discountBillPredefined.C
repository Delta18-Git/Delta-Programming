//VS12
#include <stdio.h>
#include <conio.h>
//By Vinaayak G Dasika and Suraj Premkumar
//On 15/2/19
void main()
{
    float amt, d, n;
    clrscr();
    printf("Enter bill amount\n");
    scanf("%f", &amt);
    if (amt >= 5000)
        d = 30.0 / 100;
    else if (amt >= 2000 && amt < 5000)
        d = 20.0 / 100;
    else if (amt >= 1000 && amt < 2000)
        d = 10.0 / 100;
    else if (amt < 1000 && amt > 0)
        d = 5.0 / 100;
    else
        printf("Negative bill amount not accepted");
    n = amt - amt * d;
    printf("The new bill amount is %f", n);
    getch();
}
