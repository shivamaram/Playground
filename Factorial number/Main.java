#include<iostream>
using namespace std;
class fact
{
  public:
  int f,i;
  fact()
  {
    cin>>f;
    i=f-1;
    while (i>=1)
    {
      f=f*i;
      i--;
    }
    cout<<f;
  }
};
int main()
{
	fact fac;
	return 0;
}