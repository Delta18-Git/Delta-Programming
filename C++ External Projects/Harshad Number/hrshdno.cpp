#include <iostream>

//A program to  check if it is a Harshad number.

int n; //Variable to enter
int n2; //Copy of initial variable
int chk; //Variable to check with to n2
int d; //Part of digit extractor

using namespace std;

int main() {
    cout << "Enter the number to find of Harshadness of the number:" << endl;
    cin >> n;
    n2 = n;
    //Digit Extractor
    while(n > 0)
    {
        d = n % 10;
        chk = d + chk;
        n = n / 10;
    }
    //Check for armstrongness
    if(n2 % chk == 0)
        cout << "It is an Harshad no." << endl;
    else
        cout << "It isn't an Harshad no." << endl;

}
