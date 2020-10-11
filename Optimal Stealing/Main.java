#include<iostream>
using namespace std;
int max_value(int x,int y)
{
    if(x>y)
    {
        return x;
    }
    return y;
}
int max_stealing(int value[],int N,int i)
{
    if(i>=N)
    {
        return 0 ;
    }
    return max_value(value[i]+max_stealing(value,N,i+2),max_stealing(value,N,i+1));
}

int main()
{
    int N;
    cin>>N;
    int value[N];
    for(int i=0;i<N;i++)
    {
        cin>>value[i];
    }
    cout<<max_stealing(value,N,0);
    return 0;
}