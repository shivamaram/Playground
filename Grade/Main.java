#include<iostream>
using namespace std;
class Student{
  protected:
  string name;
  int age;
  char gender;
  public:
  void get()
  {
      cout<<"Enter student's basic information:\n";
      cout<<"Name:\n";
      cin>>name;
      cout<<"Age:\n";
      cin>>age;
      cout<<"Gender:\n";
      cin>>gender;
    	cout<<endl;
  }
};
class marks{
    protected:
    int totalmarks;
    char grade;
    public:
    void getmarks(){
        cout<<"Enter student's result information:\n";
        cout<<"Total Marks:\n";
        cin>>totalmarks;
        cout<<"Grade:\n";
        cin>>grade;
    }
};

class principal:public Student,public marks{
    public:
    void display()
    {
        cout<<"Name: "<<name<<endl;
        cout<<"Age: "<<age<<endl;
        cout<<"Gender: "<<gender<<endl;
        cout<<"Total Marks: "<<totalmarks<<endl;
        cout<<"Percentage: "<<totalmarks/5<<endl;
        cout<<"Grade: "<<grade<<endl;
        
    }
};
int main()
{
    principal obj;
    obj.get();
    obj.getmarks();
    obj.display();
    return 0;
}
