#include<iostream>
using namespace std;
class Base
{
public:
  int n;
    Base ()
  {
  cout <<"Base class constructor"<<endl;
      
  }
};
class Derived:public Base
{   public:
    Derived(){
        cout<<"Derived class constructor"<<endl;
    }
};

int main ()
{
    Derived obj;
    cin>>obj.n;
    cout<<"The given input is "<<obj.n<<endl;
  return 0;
}
