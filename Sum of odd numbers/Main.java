#include<iostream>
using namespace std;
class Sum{
  public:
  int n;
  int odd_sum(int);
};
int Sum::odd_sum(int x){
    int sum=0;
    for(int i=1;i<=x;i++)
    {
        if(i%2==1)
        {
            sum=sum+i;
        }
    }
    return sum;
}
int main()
{
  Sum obj;
  cin>>obj.n;
  cout<<obj.odd_sum(obj.n);
  return 0;
}