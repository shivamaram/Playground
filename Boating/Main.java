#include<iostream>
using namespace std;
int main()
{
  int bc,adult,child;
  cin>>bc>>adult>>child;
  if(bc>((75*adult)+(30*child)))
    cout<<"Boat is stable";
  else
    cout<<"Boat will sink";
}