#include<iostream>
#include<cstdlib>
using namespace std;
struct btree
{
	int data;
	struct btree * left;
	struct btree * right;
};
struct btree * root, * temp;
void create(int n)
{
	temp = (struct btree *)malloc(sizeof(struct btree ));
	
	temp -> data = n;
	temp->right  = temp->left = NULL;
}
void insert(struct btree * t)
{
	if(t->data < temp -> data && t-> right != NULL){
		insert(t->right);
	}
	else if(t->data < temp -> data && t-> right == NULL){
		t->right = temp;
	}
	else if(t->data > temp -> data && t-> left != NULL){
		insert(t->left);
	}
	else if(t->data > temp -> data && t-> left == NULL){
		t->left = temp;
	}
}
int sumLeaf(btree* root)
{
    if(root==NULL)
    {
      return 0;    }
      if(root->left==NULL && root->right ==NULL)
      {
          return root->data;
      }
      return (sumLeaf(root->left)+sumLeaf(root->right));
}
int main()
{
	int data=0;
	root = NULL;
	while(data>=0)
	{
      cin>>data;
      if(data>0)
		create(data);
		if(root == NULL)
			root = temp;
		else
			insert(root);
	}
 int sum= sumLeaf(root);
  cout<<"Sum of all leaf nodes are "<<sum;
  return 0;
}