#include <iostream>
//A program to check for twin primes

int high,i,j,cnt;

using namespace std;

int main()
{
    high = 1000;
    cnt = 0;
    for(i = 1; i <= high; i++)
    {
        for(j = 1; j <= i; j++)
        {
            if((i % j == 0) && ((i+1) % (j+1) == 0))
               cnt++;
        }
        if(cnt == 2)
            cout << i << " & " << i+1 << " are twin prime." << endl;
    }
}
