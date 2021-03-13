//VS05
#include <stdio.h>
#include <conio.h>
//A program to print total and average marks
//By SP and VGD
//On 7/12/18
void main()
{
    double m, e, ss, s, l2;
    clrscr();
    printf("Enter the Mathematics marks out of hundred\n");
    scanf("%lf", &m);
    printf("Enter the Social Studies marks out of hundred\n");
    scanf("%lf", &ss);
    printf("Enter the Science marks out of hundred\n");
    scanf("%lf", &s);
    printf("Enter the Second Language marks out of hundred\n");
    scanf("%lf", &l2);
    printf("Enter the Enlish marks out of hundred\n");
    scanf("%lf", &e);
    printf("The total marks are %lf/500\n", m + e + ss + s + l2);
    printf("The average marks %lf/100\n", (m + e + ss + s + l2) / 5);
    getch();
}
