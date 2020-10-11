#include<iostream>
#include<stdlib.h>

using namespace std;
struct node{
  int data;
  struct node*next;
};

void append(struct node ** head,int data)
{
  struct node * newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=data;
  newnode->next=NULL;
  if (*head==NULL)
    {
      *head=newnode;
    }
  else
    {
      struct node *temp=*head;
      while(temp->next!=NULL)
      {
        temp=temp->next;
      }
      temp->next=newnode;
    }

}

void print(struct node *head)
{
  struct node*temp=head;
  while(temp!=NULL)
  {
    cout<<temp->data<<endl;
    temp=temp->next;
  }
}

int main()
{
  struct node*head;
 int data=0;
 while(data>=0)
 {
   cin>>data;
   if(data>0)
   {
     append(&head ,data); 
   }
   else
     break;
 }
  print(head);
  return 0;
}