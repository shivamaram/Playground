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
void preorder(struct btree * t)
{
	if(root == NULL)
	{
		cout<<"No element";
		return;
	}
	cout<< t->data<<" ";
	if(t->left!=NULL)
		preorder(t->left);
	if(t->right != NULL)
		preorder(t->right);
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
  cout<<"Preorder Traversal:"<<endl;
	preorder(root);
	//cout<<endl;
	//postorder(root);
}