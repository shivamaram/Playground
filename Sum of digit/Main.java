

#include <iostream>

using namespace std;
class sum{
    public:
    int n;
    int digitsum(int);
};
int sum::digitsum(int x)
{
    int rem,sum=0;
    while(x>0)
    {
     rem=x%10;
     sum=sum+rem;
     x=x/10;
    }
    return sum;
}
int main()
{
    sum obj;
    cin>>obj.n;
    cout<<obj.digitsum(obj.n);
    return 0;
}
