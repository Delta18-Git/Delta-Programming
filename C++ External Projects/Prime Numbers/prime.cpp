#include <iostream>
using namespace std;
int main()
{
    int low, high, i, flag;
    low = 1;
    high = 100;
    cout << "Prime numbers between are: ";
    while (low < high)
    {
        flag = 0;
        for(i = 2; i <= low/2; ++i)
        {
            if(low % i == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            cout << low << " ";
        ++low;
    }
}
