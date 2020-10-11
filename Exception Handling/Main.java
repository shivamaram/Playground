#include<iostream>
using namespace std;
class Zero{};
class Char{};
int main()
{
  double a,b;
  char c;
  try{
      cin>>a;
      if(a==0)
        throw Zero();
      cin>>c;
      if(c=='+' or c=='-' or c=='*' or c=='/')
      {
      }
      else
        throw Char();
      cin>>b;
      if(b==0)
          throw Zero();
      if(c=='+')
        cout<<a<<" + "<<b<<" = "<<a+b;
      else if(c=='-')
        cout<<a<<" - "<<b<<" = "<<a-b;
   	  else if(c=='*')
        cout<<a<<" * "<<b<<" = "<<a*b;
      else if(c=='/')
        cout<<a<<" / "<<b<<" = "<<a/b;
  }
  catch(Zero)
  {
    cout<<"Bad Operation";
  }
  catch(Char)
  {
    cout<<"It is not a Valid Operator";
  }
}