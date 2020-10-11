#include<iostream>
#include <stdio.h>
#include<stdlib.h>

using namespace std;
struct node

{
    
int data;
    
struct node *left,*right;

}*root;


struct node *newnode(int item)

{
   
 struct node*temp=(struct node*)malloc(sizeof(struct node));
   
 temp->data=item;
   
 temp->left=temp->right=NULL;
 
   return temp;

}


struct node*insert(struct node* node,int data)

{
   
 if(node==NULL)
   
 {
        
return newnode(data);
  
  }
   
 if(data < node->data)
 
   {
       
 node->left=insert(node->left,data);
  
  }
    
else if(data > node->data)
  
  {
      
  node->right=insert(node->right,data);
 
   }
    
return node;

}
int addBT(struct node* root) 
{ 
    if (root == NULL) 
        return 0; 
    return (root->data + addBT(root->left) + addBT(root->right)); 
} 
int main()

{
    
int data,n;
 
  // printf("insert\n");
 
do

    {

        scanf("%d",&data);
 
       if(data>0)
  
      {

            root=insert(root,data);

        }

        
    }
while(data>0);
cout<<"Sum of all nodes are "<<addBT(root);

   return 0;

}