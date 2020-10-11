#include<iostream>
using namespace std;
class EB{
  public:
  int bill_no,unit;
  string s;
  void fun(){
    cin>>bill_no>>s>>unit;
    cout<<bill_no<<endl<<s<<endl<<unit<<endl;
    if(unit<=100)
    	cout<<unit*1.2;
    else if(unit<=300)
      	cout<<120+(unit-100)*2;
    else
      	cout<<120+400+(unit-300)*3;
  }
};
int main()
{
  EB obj;
  obj.fun();
  return 0;
}