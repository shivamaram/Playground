#include<iostream>
#include<string.h>
using namespace std;

class staff
{
        int staff_id;
        char name[20];
        float salary;
    public:
        
        void accept()
        {
                cout<<"Enter Staff Id : "<<endl;
                cin>>staff_id;
                cout<<"Enter Staff Name : "<<endl;
                cin>>name;
                cout<<"Enter Salary : "<<endl;
                cin>>salary;
        }
        void display();
        friend void sort(char nm[], int n, staff *s);
        void operator =(staff s1);
};
void staff::operator=(staff s1)
{
        staff_id = s1.staff_id;
        strcpy(name,s1.name);
        salary = s1.salary;
}
void staff::display()
{
        cout<<"Staff Id : "<<staff_id<<endl;
        cout<<"Name : "<<name<<endl;
        cout<<"Salary : "<<salary<<endl;
  		cout<<endl;
}
void sort(char nm[], int n, staff *s)  //Function for sorting the data by employee name
{
        staff temp;
        for(int i=0; i<n; i++)
        {
                for(int j=i+1; j<n; j++)
                {
                        int r = strcmp(s[i].name,s[j].name);
                        if(r>0)
                        {
                                temp=s[i];
                                s[i]=s[j];
                                s[j]=temp;
                        }
                }
        }
}
int main()
{
        int ch;
        staff *s;
        int n;
        cout<<"Enter No.of Records You Want : "<<endl;
        cin>>n;
        s = new staff[n];
        do
        {
                cout<<"1. Accept Data "<<endl;
                cout<<"2. Display Data "<<endl;
                cout<<"3. Sort Data by Name "<<endl;
                cout<<"4. Exit: "<<endl;
                cout<<"Enter Your Choice : "<<endl;
                cin>>ch;
                switch(ch)
                {
                        case 1:
                                for(int i=0; i<n; i++)
                                {
                                        cout<<"Enter Data for Employee " <<i+1<<endl;
                                        s[i].accept();
                                }
                                break;
                        case 2:
                                for(int i=0; i<n; i++)
                                {
                                        s[i].display();
                                }
                                break;
                        case 3:
                                sort("a", n, s);
                                cout<<"Data is Sorted!!!"<<endl;
                    			cout<<endl;
                                break;
                        case 4:
                                exit(0);
                        default:
                                cout<<"Invalid Choice . . ."<<endl;
        }
        }
        while(ch!=4);
        return 0;
}