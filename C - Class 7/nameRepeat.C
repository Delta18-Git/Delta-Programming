//VS13
#include <stdio.h>
#include <conio.h>
//By Vinaayak G Dasika and Suraj Premkumar
//On 25/02/19
void main()
{
	clrscr();
	char name[100];
	printf("Enter your name ");
	scanf("%s", &name);
	for (int x = 1; x <= 10; x++)
		printf("\n Your name is %s ", name);
	getch();
}
