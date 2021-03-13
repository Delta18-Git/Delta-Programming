//VS16
#include <stdio.h>
#include <conio.h>
//By VGD and SP
//On 8/3/19
void main()
{
    int a;
    clrscr();
    printf("Enter a day number of the week.");
    scanf("%d", &a);
    switch (a)
    {
    case 1:
        printf("Sunday");
        break;
    case 2:
        printf("Monday");
        break;
    case 3:
        printf("Tuesday");
        break;
    case 4:
        printf("Wednesday");
        break;
    case 5:
        printf("Thursday");
        break;
    case 6:
        printf("Friday");
        break;
    case 7:
        printf("Saturday");
        break;
    default:
        printf("What are you thinking putting an invalid day number?");
    }
    getch();
}
