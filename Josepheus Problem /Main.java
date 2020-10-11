#include<iostream>
using namespace std;
   int josephus(int n, int k)  
    { 
        int sum = 0;
        for(int i = 1; i <= n; i++)  
        { 
            sum = (sum + k) % i; 
        } 
  
        return sum+1; 
    } 
 
    int  main() 
    {  
		int n,k;
     cin>>n>>k;
        cout<<josephus(n, k);  
    } 
