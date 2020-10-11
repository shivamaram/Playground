
#include <iostream>

using namespace std;
struct node{
    int data;
    struct node *next;
};
void push(struct node **head,int value)
{
    struct node *newnode=(struct node*)malloc(sizeof(struct node));
    newnode->data=value;
    newnode->next=*head;
    *head=newnode;
}
void print(struct node *head)
{
    struct node * temp=head;
    while(temp!=NULL)
    {
        cout<<temp->data<<endl;
        temp=temp->next;
    }
}
int main()
{
   int n;
   struct node *head=NULL;
   while(1)
   {
       cin>>n;
       if(n>0)
        push(&head,n);
        else
        break;
   }
   print(head);

    return 0;
}
