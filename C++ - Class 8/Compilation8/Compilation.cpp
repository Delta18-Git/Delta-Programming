#include <iostream>
#include <windows.h>
using namespace std;

void adder()
{
    int a, b, c;
    cout << "Enter the first number." << endl;
    cin >> a;
    cout << "Enter the second number." << endl;
    cin >> b;
    c = a + b;
    cout << "The sum of " << a << " and " << b << " is " << c << endl;
    Sleep(10000);
    exit(10);
}

void triarea()
{
    float b, h, a;
    cout << "Enter the base of the triangle" << endl;
    cin >> b;
    cout << "Enter the height of the triangle." << endl;
    cin >> h;
    a = 0.5 * b * h;
    cout << "The area of the triangle is " << a << endl;
    Sleep(10000);
    exit(10);
}

void sub5()
{
    float e, m, s, l2, sst, t, a;
    cout << "This program calculates total and average marks in 5 subjects." << endl;
    cout << "Enter marks obtained in English" << endl;
    cin >> e;
    cout << "Enter marks obtained in Mathematics" << endl;
    cin >> m;
    cout << "Enter marks obtained in Science" << endl;
    cin >> s;
    cout << "Enter marks obtained in Second Language" << endl;
    cin >> l2;
    cout << "Enter marks obtained in Social Studies" << endl;
    cin >> sst;
    t = e + m + s + l2 + sst;
    a = t / 5;
    cout << "The total marks obtained are " << t << endl;
    cout << "The average marks are " << a << endl;
    Sleep(10000);
    exit(10);
}

void feetconv()
{
    double f, m;
    cout << "Enter the value in feet which you wish to convert to meters." << endl;
    cin >> f;
    m = f * 3.28;
    cout << f << " ft in meters is approximately " << m << " m." << endl;
    Sleep(10000);
    exit(10);
}

void fcconv()
{
    float f, c;
    cout << "Enter the temperature in Fahrenheit." << endl;
    cin >> f;
    c = (f - 32) * 5 / 9;
    cout << f << " F in Celsius is " << c << " C." << endl;
    Sleep(10000);
    exit(10);
}

void circleac()
{
    float r, a, c;
    cout << "Enter the radius of the circle" << endl;
    cin >> r;
    a = (22.0 / 7) * r * r;
    c = (22.0 / 7) * 2 * r;
    cout << "The area of the circle is " << a << endl;
    cout << "The circumference of the circle is " << c << endl;
    Sleep(10000);
    exit(10);
}

void si()
{
    float p, r, t, i;
    cout << "Enter the principal for calculating simple interest." << endl;
    cin >> p;
    cout << "Enter the rate of interest." << endl;
    cin >> r;
    cout << "Enter number of years for interest to collect." << endl;
    cin >> t;
    i = (p * r * t) / 100;
    cout << "The simple interest for " << p << " over " << t << " years at " << r << "% interest is " << i << endl;
    Sleep(10000);
    exit(10);
}

void vote()
{
    int age;
    char name[25];
    cout << "Enter you name." << endl;
    cin >> name;
    cout << "Enter your age, " << name << "." << endl;
    cin >> age;
    if(age >= 18)
	cout << name << ", you can vote!" << endl;
    else
	cout << "Sorry " << name << ", you can't vote." << endl;
    Sleep(10000);
    exit(10);
}

void posneg()
{
    int num;
    cout << "Enter the number." << endl;
    cin >> num;
    if(num > 0)
	cout << num << " is positive." << endl;
    else if(num < 0)
	cout << num << " is negaive." << endl;
    else
	cout << "It is zero." << endl;
    Sleep(10000);
    exit(10);
}

void oddeve()
{
    int no;
    cout << "Enter the number." << endl;
    cin >> no;
    if(no % 2 == 0)
	cout << no << " is even." << endl;
    else
	cout << no << " is odd." << endl;
    Sleep(10000);
    exit(10);
}

void consvow()
{
    char c;
    cout << "Enter a letter." << endl;
    cin >> c;
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
	cout << c << " is a Vowel" << endl;
    else
	cout << c << " is a Consonant" << endl;
}
int main()
{
    int choice;
    cout << "Enter a number (0 - 6) to run the program." << endl;
    cout << "0. Add two numbers together." << endl;
    cout << "1. Find the area of a triangle." << endl;
    cout << "2. Calculate the total and average marks in 5 subjects." << endl;
    cout << "3. Convert feet to meters." << endl;
    cout << "4. Convert Fahrenheit to Celsius." << endl;
    cout << "5. Calculate Simple Interest." << endl;
    cout << "6. Calculate the area and circumference of a circle." << endl;
    cout << "7. Check if you are eligible to vote." << endl;
    cout << "8. Check if a number is positive, negative or zero." << endl;
    cout << "9. Check if a number is odd or even." << endl;
    cout << "Enter your choice: ";
    cin >> choice;
    switch(choice) {
    case 0:
	adder();
	break;
    case 1:
	triarea();
	break;
    case 2:
	sub5();
	break;
    case 3:
	feetconv();
	break;
    case 4:
	fcconv();
	break;
    case 5:
	si();
	break;
    case 6:
	circleac();
	break;
    case 7:
	vote();
	break;
    case 8:
	posneg();
	break;
    case 9:
	oddeve();
	break;
    default:
	cout << "Incorrect value. Terminating in 5 seconds." << endl;
	Sleep(5000);
	return 0;
    }
    return 0;
}
