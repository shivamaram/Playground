#include<iostream>
using namespace std;
class Node
{
	public:
	int data;
	Node *next;
};

void enqueue(struct Node **head, int value)
{
	Node *newnode = new Node();
	Node *temp = *head;
	newnode->data = value;
	newnode->next = NULL;
	
	if(*head == NULL)
	{
	    *head = newnode;
	}
  		else
	{
	    while(temp->next != NULL)
	        temp = temp->next;
	    temp->next = newnode;
	}
}
void print(Node *head)
{
	Node *temp = head;
	while(temp != NULL)
	{
		cout << temp->data<<" ";
		temp = temp->next;
	}
}

int main()
{
	Node *head = NULL;	
	int n;
	while(1)
	{
		cin >> n;
		if(n != -1)
			enqueue(&head, n);
		else
			break;
	}
	print(head);
  return 0;
}