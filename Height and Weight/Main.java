#include<iostream>
using namespace std;
class Nailah{
  public:
  int details(int age)
  {
    return age;
  }
  void details(float height)
  {
    cout<<height;
  }
};
int main()
{
  Nailah obj;
  int age;
  float height;
  cin>>age>>height;
  cout<<obj.details(age)<<endl;
  obj.details(height);
}