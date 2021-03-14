#include <iostream>

//A program written to output factors of a no.

int x;

using namespace std;

int main(){
    cout << "Enter the number you want to find the factor of." << endl;
    cin >> x;
    for(int y = 1; y <= x ; y++)
        if (x%y == 0)
            cout << y << endl;
}
