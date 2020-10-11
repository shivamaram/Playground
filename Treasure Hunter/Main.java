#include<iostream>
using namespace std;
int main()
{
    int n,bep,blp;
    int be,bl,r;
    cin>>n>>bep>>blp;
    be=(bep*n)/100;
    bl=(blp*(n-be))/100;
    r=(n-be-bl)/3;
    cout<<be<<endl<<bl<<endl<<r;
    
    return 0;
}