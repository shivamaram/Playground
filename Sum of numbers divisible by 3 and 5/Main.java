#include<iostream>
using namespace std;


 void result(int m  , int n ) 
    {      
        int sum = 0 ,num;
        for ( num = m; num < n; num++) 
        {      
           
            if (num % 3 == 0 && num % 5 == 0) 
                sum = sum +num;   
        } 
          cout<<sum<<" "; 
    } 
       
int main() 
    { 
        int a,b;
      cin>>a;
  cin>>b;
      result(a,b);
  return 0;
   } 
