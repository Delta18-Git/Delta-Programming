#include <iostream>

//A program to  check if it is a Armstrong number.

int n; //Variable to enter
int n2; //Copy of initial variable
int chk; //Variable to check with to n2
int d; //Part of digit extractor

using namespace std;

int main() {
    cout << "Enter the number to find of Armstrongness of the number:" << endl;
    cin >> n;
    n2 = n;
    //Digit Extractor
    while(n > 0)
    {
        d = n % 10;
        chk = d*d*d + chk;
        n = n / 10;
    }
    //Check for armstrongness
    if(chk == n2)
        cout << "It is an Armstrong no." << endl;
    else
        cout << "It isn't an Armstrong no." << endl;

}
