#include <iostream>

//A program to find the factorial of a no.

int x;
int prod = 1;

using namespace std;

int main() {
    cout << "Enter the number to find  the factorial of." << endl;
    cin >> x;
    for(int i = 1; i <= x; i++)
       prod = prod * i;
    cout << prod << endl;
}
