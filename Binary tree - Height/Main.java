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
int height(struct btree *t)
{
	if(t == NULL)
	{
		return 0;
	}
	else
	{
		int lheight = height(t->left);
		int rheight = height(t->right);
		if(lheight>rheight)
		{
			return lheight+1;
		}
		else
		{
			return rheight+1;
		}
	}
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
  cout<<"Height of the tree is "<<height(root);

}