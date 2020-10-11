#include<iostream>
using namespace std;
class Arith
{
  public:
  int a,b,c,d,e,f,g,h;
  Arith()
  {
    cin>>a>>b>>c>>d>>e>>f>>g>>h;
    cout<<a+b<<endl<<c-d<<endl<<e*f<<endl<<g/h;
  }

};

int main()
{
  Arith ari;
}