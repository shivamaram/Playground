#include<iostream>
using namespace std;
class Hello
{
  public:
  string name;
  int rn;
  int marks;
};
int main()
{
  Hello obj;
  cout<<"Enter name: "<<endl;
  cin>>obj.name;
  cout<<"Enter roll number: "<<endl;
  cin>>obj.rn;
  cout<<"Enter total marks outof 500: "<<endl;
  cin>>obj.marks;
  cout<<"Student details:"<<endl;
  cout<<"Name: "<<obj.name<<endl;
   cout<<"Roll Number: "<<obj.rn<<endl;
  cout<<"Total: "<<obj.marks<<endl;
  cout<<"Percentage: "<<obj.marks/5.0;
  
  return 0;
}