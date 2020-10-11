

#include <iostream>

using namespace std;
class Evenorodd{
    public:
    int n;
    void check(int);
};
void Evenorodd::check(int x)
{
    if(x%2==0)
    cout<<"EVEN";
    else 
    cout<<"ODD";
}
int main()
{
    Evenorodd obj;
    cin>>obj.n;
    obj.check(obj.n);
    return 0;
}
