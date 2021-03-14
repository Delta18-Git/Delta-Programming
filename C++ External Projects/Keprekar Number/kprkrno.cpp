#include <iostream>

int i,si,r;

using namespace std;

int main()
{
    cout << "Enter a number to check for Kaprekarness." << endl;
    cin >> i;
    si = i * i;
    while(si > 0)
    {
        r = si % 100;
        si = si / 100;
    }
    cout << r << endl;
    cout << si << endl;
    if(si + r == i)
        cout << i << " is a Kaprekar number" << endl;
    else
        cout << i << " isn't a Kaprekar number" << endl;
}
