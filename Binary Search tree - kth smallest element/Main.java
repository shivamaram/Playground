#include<bits/stdc++.h>

#include <stdio.h>
#include<stdlib.h>
using namespace std;
struct node
{
  int data;
  struct node *left, *right;
} *root;


struct node *
newnode (int item)
{

  struct node *temp = (struct node *) malloc (sizeof (struct node));

  temp->data = item;

  temp->left = temp->right = NULL;

  return temp;

}


struct node *
insert (struct node *node, int data)
{

  if (node == NULL)

    {

      return newnode (data);

    }

  if (data < node->data)

    {

      node->left = insert (node->left, data);

    }

  else if (data > node->data)

    {

      node->right = insert (node->right, data);

    }

  return node;

}


void
inorder (struct node *root)
{

  if (root != NULL)

    {

      inorder (root->left);

      printf ("%d", root->data);

      inorder (root->right);

    }


}

// A function to find 
int KSmallest(node *root, int k) 
{ 
    // Count to iterate over elements till we 
    // get the kth smallest number 
    int count = 0; 
  
    int ksmall = INT_MIN;
    node *curr = root; 
  
    while (curr != NULL) 
    { 
        if (curr->left == NULL) 
        { 
            count++; 
            if (count==k) 
                ksmall = curr->data; 
            curr = curr->right; 
        } 
        else
        {
            node *pre = curr->left; 
            while (pre->right != NULL && pre->right != curr) 
                pre = pre->right; 
  
            if (pre->right==NULL) 
            { 
                pre->right = curr; 
                curr = curr->left; 
            } 
  
            else
            { 
                pre->right = NULL; 
  
                count++; 
  
                if (count==k) 
                    ksmall = curr->data; 
  
                curr = curr->right; 
            } 
        } 
    } 
    return ksmall; 
} 
  
int
main ()
{

  int data;
  do

    {

      scanf ("%d", &data);

      if (data > 0)

	{

	  root = insert (root, data);

	}


    }
  while (data > 0);

  
  cout<<"Enter the kth value:"<<endl;
  int k;
  cin>>k;
  cout <<"Smallest kth value "<< KSmallest(root, k); 
  return 0;

}
