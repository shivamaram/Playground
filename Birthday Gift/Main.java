#include<iostream>
using namespace std;
class Birthday{
  public:
  int mp;
  int lp;
  int bp;
  int gift(int mp,int lp)
  {
    return mp+lp;
  }
  int gift(int mp,int lp,int bp)
  {
    return mp+lp+bp;
  }
};
int main()
{
  Birthday obj;
  cin>>obj.mp>>obj.lp>>obj.bp;
  cout<<obj.gift(obj.mp,obj.lp)<<endl;
  cout<<obj.gift(obj.mp,obj.lp,obj.bp);
}