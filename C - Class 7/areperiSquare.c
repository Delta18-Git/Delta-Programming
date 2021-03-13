//VS03
#include <stdio.h>
#include <conio.h>
//A progra to calculate area and perimeter of a square
//By Vinaayak and Suraj
//On 30/11/18
void main()
{
    clrscr();
    int a;
    printf("Enter the length of the side of the square.\n");
    scanf("%d", &a);
    printf("The area of the square is %d\n", a * a);
    printf("The perimeter of the square is %d\n", a * 4);
    printf("Press any key to terminate the program.");
    getch();
}