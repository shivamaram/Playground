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

struct node *lca(struct node* root, int n1, int n2) 
{ 
    if (root == NULL) 
        return NULL; 
  
    if (root->data > n1 && root->data > n2) 
        return lca(root->left, n1, n2); 
  
    
    if (root->data < n1 && root->data < n2) 
        return lca(root->right, n1, n2); 
  
    return root; 
} 
int main()

{
    
int data;
 
 
 
do

    {

        scanf("%d",&data);
 
       if(data>0)
  
      {

            root=insert(root,data);

        }

        
    }
while(data>0);


   
   
    int n1, n2; 
  cout<<"Enter the value of n1 and n2:"<<endl;
    cin>>n1>>n2;
    struct node *t = lca(root, n1, n2);
     printf("Common ancestor of %d and %d is %d \n", n1, n2, t->data);
 
   return 0;

}