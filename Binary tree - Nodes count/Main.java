#include<iostream>
#include<stdlib.h>
using namespace std;
class node
{
  	public:
    int data;
    node* left;
    node *right;
};
node *root=NULL;
void insert(int a){
    node *newnode;
    node *temp;
    temp = root;
    newnode = new node;
    newnode->data = a;
    newnode->left = NULL;
    newnode->right = NULL;
    if(temp == NULL)
    {
     root = newnode;
    }
    else 
    {
        while(1)
        {
          while(temp->data > newnode->data && temp->left!=NULL)
            temp = temp->left;
            if(temp->data > newnode->data && temp->left== NULL)
            {
            temp->left=newnode;
            break;
            }
            while(temp->data < newnode->data && temp->right!= NULL)
            temp = temp->right;
            if(temp->data < newnode->data && temp->right == NULL)
            {
            temp->right = newnode;
            break;
            }
        }
    }
    
}
int display(node *root)
{
    node *temp = root;
    if(temp == NULL)
    {
    //cout<<"No elements in the tree"<<endl;
  	return 0;
    }
    else
    {
    display(temp->left);
    //cout<<temp->data<<" ";
    display(temp->right);
    }
}
int main()
{
 int a,i=1;
    do{      
        cin>>a;
        if(a<0)
        break;
        insert(a);
      i++;
    }while(1);
  	cout<<"Number of nodes are "<<i/2;
    return 0;
}