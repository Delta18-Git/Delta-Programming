#include <iostream>

using namespace std;

int ctrl = 0;
int x;

int main() {
    cout << "Enter the number to check for PRONICNESS" << endl;
    cin >> x;
    for(int i = 1; i < x; i++){
        if (i * (i + 1) == x){
            ctrl = 1;
        }
    }
    if(ctrl == 1)
        cout << "It is a pronic number" << endl;
    else if(ctrl == 0)
        cout << "It isn't a pronic number" << endl;
}
