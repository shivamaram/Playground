#include<iostream>
using namespace std;
struct Node{
 	int value;
  	Node* next;
} *root, *newNode, *temp, *temp2;

void append(int data){
  	newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->value = data;
    newNode->next = NULL;
    if (root==NULL)
    {
        root=newNode;
    }
    else
    {
        temp = root;
        while(temp->next!=NULL){
            temp=temp->next;
        }
        temp->next=newNode;
    }
}

void display(){
    temp = root;
    while (temp!=NULL)
    {
        cout<<temp->value<<endl;
        temp=temp->next;
    }
}

void insertPosition(int position, int data){
  	newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->value = data;
    newNode->next = NULL;
  	temp=root;
  	for(int i=1;i<position;i++){
      	temp=temp->next;
    }
  	temp2 = temp->next;
  	temp->next=newNode;
  	newNode->next=temp2;
}

int main()
{
    int data;
    cin>>data;
    while(data>=-0){
        append(data);
        cin>>data;
    }
  	int position;
  	cout<<"Before inserting the value:"<<endl;
  	display();
  	cout<<"Enter the position and value to be inserted:"<<endl;
  	cin>>position;
  	cin>>data;
  	insertPosition(position,data);
  	cout<<"After inserting the value:"<<endl;
    display();
  	return 0;
}