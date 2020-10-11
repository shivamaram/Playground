#include <iostream>
using namespace std;

int balance(int a,int m, int rs)
{
  int result;
  if(a > m)
  {
    result = a - m;
    rs = rs - result;
  }
  else if(a < m)
  {
     result = m - a;
     rs = rs + result;
  }
  else if(a == m)
  {
    result = rs;
  }
  return rs;
    
}
int main() 
{
   
  int a;
  int m ;
  int rs;
  cin>>a>>m>>rs;
  
  cout<<balance(a,m,rs)<<endl;
  return 0;
    
}