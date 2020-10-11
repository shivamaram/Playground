#include<iostream>
#include<stdlib.h>
using namespace std;
struct node
{
  int data;
  struct node *next;
};
struct node *head=NULL;
void append(struct node **head,int n)
{
  struct node *newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=n;
  newnode->next=NULL;
  if(*head==NULL)
  {
    *head=newnode;
  }
  else
  {
  struct node *temp=*head;
  while(temp->next!=NULL)
  	temp=temp->next;
  temp->next=newnode;
  }
}
void atposb(struct node **head,int pos,int val)
{
  struct node *temp=*head;
  struct node *newnode=(struct node*)malloc(sizeof(struct node));
  newnode->data=val;
  if(pos==1)
  {
    newnode->next=*head;
    *head=newnode;
    return;
  }
  int i=1;
  while(temp!=NULL)
  {
    if(i==pos-1)
    {
      newnode->next=temp->next;
      temp->next=newnode;
      break;
    }
    else
      temp=temp->next;
    i++;
  }
}
void print(struct node *head)
{
  struct node *temp=head;
  while(temp!=NULL)
  {
    cout<<temp->data<<"\n";;
    temp=temp->next;
  }
}
int main()
{
  //type your code here
  struct node *head=NULL;
  int n,pos,val;
  while(1)
  {
    cin>>n;
    if(n>=00)
      append(&head,n);
    else
      break;
  }
  cout<<"Before inserting the value:"<<"\n";
  print(head);
  cout<<"Enter the position and value to be inserted:"<<"\n";
  cin>>pos>>val;
  cout<<"After inserting the value:"<<"\n";
  atposb(&head,pos,val);
  print(head);
  return 0;
}