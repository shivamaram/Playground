#include<iostream>
using namespace std;
#include<queue>
void show(priority_queue<int> qp){
  priority_queue<int> temp=qp;
  while(!temp.empty())
  {
    cout<<temp.top()<<" ";
    temp.pop();
  }
  
}
int main()
{
  int n,val;
  priority_queue<int> pq;
  cout<<"Enter the number of values to be inserted:"<<endl;
  cin>>n;
  cout<<"Enter the values to be inserted in priority queue:"<<endl;
    for(int i=0;i<n;i++)
    {
      cin>>val;
      pq.push(val);
    }
  cout<<"The priority queue elements are:"<<endl;
  show(pq);
  return 0;
}