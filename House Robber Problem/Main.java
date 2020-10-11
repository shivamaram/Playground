#include<iostream>
using namespace std;
int max_stealing(int value[],int N, int i);
int max_value(int x, int y);


int main()
{
  int value[100], N,i;
  cin>>N;

  for(i = 0; i < N; i++)
  cin>>value[i];
  
 cout<<max_stealing(value, N,0);
  return 0;
}
int max_stealing( int value[],int N,int i)
{
  if(i >= N)
  {
  	return 0;
  }
  return max_value((value[i] + max_stealing(value, N, i+2)), 									max_stealing(value, N, i+1));
    
}
int max_value(int x, int y)
{
    if(x > y)
        return x;
    return y;
}