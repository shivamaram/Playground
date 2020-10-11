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
int findMax(struct node* root)  
{  
    // Base case  
    if (root == NULL)  
    return 0;  
  
    // Return maximum of 3 values:  
    // 1) Root's data 2) Max in Left Subtree  
    // 3) Max in right subtree  
    int res = root->data;  
    int lres = findMax(root->left);  
    int rres = findMax(root->right);  
    if (lres > res)  
    res = lres;  
    if (rres > res)  
    res = rres;  
    return res;  
}  
int main()

{
    
int data,n;

 
do

    {

        scanf("%d",&data);
 
       if(data>0)
  
      {

            root=insert(root,data);

        }

        
    }
while(data>0);
cout<<"Maximum element is "<<findMax(root);

   return 0;

}