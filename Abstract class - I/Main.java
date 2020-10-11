#include<iostream>
using namespace std;
class Base{
    public:
    int n;
     virtual void draw(int)=0;
    
};
class Rectangle:public Base{
   public:
   void draw(int x)
   {
       cout<<"Rectangle"<<endl;
       cout<<"The given input is "<<x<<endl;
   }
};
class Circle : public Base {
     public:
   void draw(int x)
   {
       cout<<"Circle"<<endl;
       cout<<"The given input is "<<x<<endl;
   }
};
int main(){
    Rectangle obj1;
    Circle obj2;
    cin>>obj1.n;
    obj1.draw(obj1.n);
    obj2.draw(obj1.n);
    return 0;
}