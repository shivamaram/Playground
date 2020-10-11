#include<iostream>
using namespace std;
class check{
    public:
    int n;
    void primeornot(int);
};
void check::primeornot(int x)
{
    int i,m=0,flag=0;
    m=x/2;
    for(i=2;i<=m;i++)
    {
        if(n%i==0)
        {
            cout<<"Not Prime";
            flag=1;
            break;
        }
    }
    if(flag==0)
    cout<<"Prime";
}
int main(){
    
    check obj;
    cin>>obj.n;
    obj.primeornot(obj.n);
    return 0;
}