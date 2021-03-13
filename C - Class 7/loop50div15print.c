//VS19
#include <stdio.h>
#include <conio.h>
//By Vinaayak G Dasika and Suraj Premkumar
//On 8/3/19
void main()
{
    clrscr();
    for (int i = 40; i <= 90; i++)
    {
        if (i % 3 == 0 && i % 5 == 0)
            printf("\t %d", i);
    }
}
