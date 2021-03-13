//VS0c
#include <iostream.h>

int main()
{
    float e,m,s,l2,sst,t,a;
    cout<<"This program calculates total and average marks in 5 subjects."<<endl;
    cout<<"Enter marks obtained in English"<<endl;
    cin>>e;
    cout<<"Enter marks obtained in Mathematics"<<endl;
    cin>>m;
    cout<<"Enter marks obtained in Science"<<endl;
    cin>>s;
    cout<<"Enter marks obtained in Second Language"<<endl;
    cin>>l2;
    cout<<"Enter marks obtained in Social Studies"<<endl;
    cin>>sst;
    t = e + m + s + l2 + sst;
    a = t/5;
    cout<<"The total marks obtained are "<<t<<endl;
    cout<<"The average marks are "<<a<<endl;
    return 0;
}
