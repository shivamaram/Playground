#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int t,wv;
  cin>>t>>wv;
  float WCF = 35.74 + 0.6215*t + (0.4275*t - 35.75) * pow(wv,0.16);
  cout<<WCF;
}