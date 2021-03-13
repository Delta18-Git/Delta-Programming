//VS0d
#include <iostream.h>

int main()
{
    int age;
    char name[25];
    cout<<"Enter you name."<<endl;
    cin>>name;
    cout<<"Enter your age, "<<name<<"."<<endl;
    cin>>age;
    if (age>=18)
    	cout<<name<<", you can vote!"<<endl;
    else
    	cout<<"Sorry "<<name<<", you can't vote."<<endl;
    return 0;
}
