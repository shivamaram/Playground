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
/*void inorder(struct btree * t)
{
	if(root == NULL){
		cout<<"No element";
		return;
	}
	
	if(t->left!=NULL)
	{
		inorder(t->left);
	}
	
	cout<< t->data<<" ";
	
	if(t->right != NULL)
	{
		inorder(t->right);
	}
}
*/
void Search(struct btree *root, int d) {
   int depth = 0;
   btree *temp = new btree;
   temp = root;
   while(temp != NULL) {
      depth++;
      if(temp->data == d) {
         cout<<d<<" is present in the BST";
         return;
      } else if(temp->data > d)
         temp = temp->left;
         else
            temp = temp->right;
   }
   cout<<d<<" is not present in the BST";
   return;
}
int main()
{
	int data=0,key;
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
  cout<<"Enter the element to be searched:"<<endl;
  cin>>key;
  Search(root,key);
	//inorder(root);
  return 0;
}

