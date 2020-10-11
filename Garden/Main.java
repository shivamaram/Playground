#include<iostream>
using namespace std;
class Area{
  public:
  int radius;
  float fun()
  {
    return 3.14*radius*radius;
  }
};
int main()
{
  Area obj;
  cout<<"Enter the value of Radius :\n";
  cin>>obj.radius;
  cout<<"Area of Circle : ";
  cout<<obj.fun();
  return 0;
}