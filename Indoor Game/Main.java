#include<iostream>
using namespace std;
class Ajju{
    public:
  Ajju(int side)
  {
    cout<<side*side<<endl;
  }
  Ajju(int length,int breadth)
  {
    cout<<length*breadth;
  }
};
int main()
{
 
  int side,length,breadth;
	cin>>side>>length>>breadth;
  Ajju Carrom(side);
  Ajju TT(length,breadth);
	return 0;
}