//VS03
#include <iostream.h>

int main()
{
    float p,r,t,i;
    cout<<"Enter the principal for calculating simple interest."<<endl;
    cin>>p;
    cout<<"Enter the rate of interest."<<endl;
    cin>>r;
    cout<<"Enter number of years for interest to collect."<<endl;
    cin>>t;
    i=(p*r*t)/100;
    cout<<"The simple interest for "<<p<<" over "<<t<<" years at "<<r<<"% interest is "<<i<<endl;
    return 0;
}
