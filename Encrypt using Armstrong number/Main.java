#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int temp=n,c=0,remainder,result=0;
   while (temp != 0)
    {
        temp /= 10;
        ++c;
    }

    temp = n;

    while (temp != 0)
    {
        remainder = temp%10;
        result += power(remainder, c);
        temp /= 10;
    }
  if(n==result)
    return 1;
  else
    return 2;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}