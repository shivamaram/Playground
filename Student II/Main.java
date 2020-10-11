#include<iostream>
using namespace std;
class Student
{
  public:
  char name[100];
  int age,marks;
  Student()
  {
    cin>>name>>age>>marks;
  }

};

int main()
{
	Student stu;
  cout<<stu.name<<endl<<stu.age<<endl<<stu.marks<<"%";
	return 0;
}