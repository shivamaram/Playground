#include<iostream>
using namespace std;
class Shape
{   public:
	virtual void Enter_data()=0;
  	virtual void perimeter()=0;
};
class Rectangle : public Shape
{   public:
	float length,breadth;
    void Enter_data(){
    cin>>length>>breadth;
    }
    void perimeter()
    {
        cout<<"Perimeter of rectangle: ";
    cout<<2*(length+breadth)<<endl;
    }
	
};
 
class Circle : public Shape 
{   public:
	float radius;
    void Enter_data()
    {
    cin>>radius;
    }
    void perimeter()
    {
      cout<< "Perimeter of circle: "; 
    cout<<2*3.14*radius;		
    }
};
int main()
{
    Shape *obj;
    Rectangle robj;
    Circle cobj;
    obj=&robj;
    obj->Enter_data();
    obj->perimeter();
    obj=&cobj;
    obj->Enter_data();
    obj->perimeter();
    
}