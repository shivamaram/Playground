#include<iostream>
#include<stdlib.h>

using namespace std;
struct node{
  int data;
  struct node*next;
};

void push(struct node ** top,int data)
{
  struct node * newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=data;
  newnode->next=*top;
      *top=newnode;

}

void print(struct node *top)
{
  struct node*temp=top;
  while(temp!=NULL)
  {
    cout<<temp->data<<" ";
    temp=temp->next;
  }
}

int main()
{
  struct node*top;
 int data=0;
 while(data>=0)
 {
   cin>>data;
   if(data>0)
   {
     push(&top ,data); 
   }
   else
     break;
 }
  print(top);
  return 0;
}