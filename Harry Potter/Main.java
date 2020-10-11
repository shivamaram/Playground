#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a =n%10;
  int b=n/1000;
  int res=a+b;
  cout<<res;
}