#include<iostream>
#include<cmath>
using namespace std;

int main(){
int n,m,req,bacgain;
  cin>>m;
  cin>>n;
  cin>>req;
  bacgain=pow(m,n);
  //cout<<bacgain;
  if(bacgain>=req)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
  return 0;
}