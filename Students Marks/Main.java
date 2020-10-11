

#include <iostream>

using namespace std;
class student{
    protected:
    int rollnum,m1,m2;
    public:
    void get(){
        cin>>rollnum>>m1>>m2;
    }
    
};
class teacher:public student
{
    public:
    int total;
    void display()
    {
        cout<<"Roll Number Is:"<<endl<<rollnum<<endl;
        cout<<"Subject 1:"<<m1<<endl;
        cout<<"Subject 2:"<<m2<<endl;
        cout<<"Total:"<<m1+m2<<endl;
        
    }
    
};
int main()
{
   teacher obj;
   obj.get();
   obj.display();

    return 0;
}
