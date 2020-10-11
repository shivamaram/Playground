#include<iostream>
using namespace std;
int main()
{
    float i1,i2;
    int d;
    float a,s;
    cin>>i1>>i2>>d;
    s=i1+i2;
    a=(s-(d/100.0)*s);
    cout<<s<<endl<<a<<endl<<s-a<<endl;
    // fill the code
    return 0;
}