#include <iostream.h>

int main()
{
    float f,c;
    cout<<"Enter the temperature in Fahrenheit."<<endl;
    cin>>f;
    c = (f-32)*5/9;
    cout<<f<<" F in Celsius is "<<c<<" C."<<endl;
    return 0;
}
