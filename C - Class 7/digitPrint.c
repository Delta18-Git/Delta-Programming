//VS11
#include <conio.h>
#include <stdio.h>
// By Vinaayak G Dasika and Suraj Premkumar
// On 15/2/19
void main()
{
	clrscr();
	int n;
	printf("Please enter a single digit number\n");
	scanf("%d", &n);
	switch (n)
	{
	case 0:
		printf("Zero");
		break;
	case 1:
		printf("One");
		break;
	case 2:
		printf("Two");
		break;
	case 3:
		printf("Three");
		break;
	case 4:
		printf("Four");
		break;
	case 5:
		printf("Five");
		break;
	case 6:
		printf("Six");
		break;
	case 7:
		printf("Seven");
		break;
	case 8:
		printf("Eight");
		break;
	case 9:
		printf("Nine");
		break;
	default:
		printf("Entered number not a single digit number.");
	}
	getch();
}
