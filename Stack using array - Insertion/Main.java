#include <iostream>
using namespace std; 
int stack[100], n=100, top=-1;
void push(int val) {
   if(top>=n-1)
      cout<<"Stack Overflow"<<endl; 
   else {
      top++;
      stack[top]=val;
   }
}

void display() {
   if(top>=0) {
      cout<<"Stack elements are:"<<endl;
      for(int i=top; i>=0; i--)
         cout<<stack[i]<<" ";
         cout<<endl;
   } else
      cout<<"Stack is empty";
}
int main() {
   int n, val; 
  cin>>n;
 while(n>0) {
            cin>>val;
            push(val);
   				n--;
			}
            display();
      return 0;
}