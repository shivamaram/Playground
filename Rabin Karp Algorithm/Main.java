#include <iostream>
#include<string.h>
using namespace std;
void rabin(string s,string m)
{
    int g=0,l=0,k=0;
    for(int i=0;m[i]!='\0';i++)
    {
       g++;
    }
    for(int i=0;s[i]!='\0';i++)
    {
       k++;
    }
    
      int p=0,d=37,j=0;
    
        for(int i=0;i<g;i++)
        {
            p=p+((37*p)+(int)m[i])%41;
        }
  int i;
      for( i=0;i<k;i++)
       {
           l=0;
        for(int j=0;j<g;j++)
        {
             l=l+((37*l)+(int)s[i+j])%41;
        }
        if(p==l)
        {
          cout<<"Found pattern at index "<<i;
          break;
        }
       }
}

int main() {
    string s,m;
    getline(cin,s);
    getline(cin,m);
    rabin(s,m);
	return 0;
}