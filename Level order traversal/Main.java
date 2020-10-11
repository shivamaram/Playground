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
int height(struct node* node)  
{  
    if (node == NULL)  
        return 0;  
    else
    {  
       
        int lheight = height(node->left);  
        int rheight = height(node->right);  
  
      
        if (lheight > rheight)  
            return(lheight + 1);  
        else return(rheight + 1);  
    }  
}  
  
  
  void printGivenLevel(struct node* root, int level)  
{  
    if (root == NULL)  
        return;  
    if (level == 1)  
        cout << root->data << " ";  
    else if (level > 1)  
    {  
        printGivenLevel(root->left, level-1);  
        printGivenLevel(root->right, level-1);  
    }  
}  
  

void printLevelOrder(struct node* root)  
{  
    int h = height(root);  
    int i;  
    for (i = 1; i <= h; i++)  
        printGivenLevel(root, i);  
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
  cout<<"Level order Traversal:"<<endl;
  printLevelOrder(root); 

   return 0;

}
