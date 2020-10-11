#include<iostream>
using namespace std;
int totalways(int cr,int cc,int dr,int dc)
{
    if(cr>dr||cc>dc)
    {
        return 0;
    }
    if(cr==dr&&cc==dc)
    {
        return 1;
    }
    
    int ways;
    ways=totalways(cr,cc+1,dr,dc);
    ways+=totalways(cr+1,cc,dr,dc);
    return ways;
}
int temptotalWays(int m,int n)
{
    return totalways(0,0,m-1,n-1);
}
int main()
{
    int m,n;
    cin>>m;
    cin>>n;
    cout<<temptotalWays(m,n);
    return 0;
}