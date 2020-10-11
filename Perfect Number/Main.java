#include<iostream>
using namespace std;
class check{
    public:
    int n;
    void perfectornot(int);
};
void check::perfectornot(int x)
{
  int i,sum=0;
  for(i=1;i<x;i++)
  {
      if(x%i==0)
        sum=sum+i;
  }
  if(sum==x)
    cout<<"Yes";
    else
    cout<<"No";
}
int main(){
    
    check obj;
    cin>>obj.n;
    obj.perfectornot(obj.n);
    return 0;
}