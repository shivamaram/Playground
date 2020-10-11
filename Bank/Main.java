#include<iostream>
using namespace std;
class Bank
{
  public:
  int accno,bal,dep,wid;
  char name[100],acctype[100];
  Bank()
  {
	cout<<"Enter Details:";
    cout<<endl<<"Account No.";
    cin>>accno;
    cout<<endl<<"Name :";
    cin>>name;
    cout<<endl<<"Account Type :";
    cin>>acctype;
    cout<<endl<<"Balance :";
    cin>>bal;
    cout<<endl<<"Enter Deposit Amount =";
    cin>>dep;
    cout<<endl<<"Enter Withdraw Amount =";
    cin>>wid;
  }
  void display()
  {
    bal=bal+dep;
    if (bal<wid)
    {
      cout<<endl<<"Cannot Withdraw Amount";
      bal=bal-wid;
    }
    else 
      bal=bal-wid;
    
    cout<<endl<<"Accout No. : "<<accno;
    cout<<endl<<"Name : "<<name;
    cout<<endl<<"Account Type : "<<acctype;
    cout<<endl<<"Balance : "<<bal;
  }
};
int main()
{
  Bank vin;
  vin.display();
  return 0;
}