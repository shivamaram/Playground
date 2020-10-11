#include<iostream>
using namespace std;
class Grandfather{
  protected:
  string Grandfathername;
 public:
  void getgrandfathername()
  {
      cout<<"Enter the grand parent name:\n";
      cin>>Grandfathername;
  }
};
class father:public Grandfather
{
    protected:
    string fathername;
    public:
    void getfathername(){
        cout<<"Enter the father name:\n";
        cin>>fathername;
    }
};

class son:public father{
    public:
    string sonname;
    void getsonname()
        {
            cout<<"Enter the son name:\n";
            cin>>sonname;
            
        }
    
};
int main()
{
    son obj;
    obj.getsonname();
    obj.getfathername();
    obj.getgrandfathername();
    
    
   
    
    return 0;
}
