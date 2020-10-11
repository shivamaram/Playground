#include<iostream>
using namespace std;
int main()
{
  int frnds,teams;
  cin>>frnds>>teams;
  
  cout<<"The number of friends in each team is "<<frnds/teams<<" and left out is "<<
    frnds%teams;
}