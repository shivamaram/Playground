#include<iostream>
#include<bits/stdc++.h> 
using namespace std;
class node
{
  public:
    int dat;
     node* l;
     node *r;
}*root=NULL;
void insert( node **r,int dat){
  static int i=1;
    node *n;
      node *t=*r;
    n=new node;
    n->dat=dat;
    n->l=NULL;
    n->r=NULL;
    if(*r==NULL){
        *r=n;
    }
    else{
      i++;
   int nu[10],c=i,j=0;
      while(c>1){
        nu[j++]=(c%2);
        c/=2;
      }
      for(int k=j-1;k>0;k--){
        if(nu[k]==0)
          t=t->l;
        else
          t=t->r;
      }
        if(nu[0]==0)
          t->l=n;
      else
        t->r=n;
}}

int verticalSum(node *root) 
{ int a=0,b=0;
 node *t=root;
 while(t!=NULL){
   a++;
   t=t->l;
 }
 while(root!=NULL){
   b++;
   root=root->r;
 }
   return a+b-1;
} 
int main()
{
 int a;
    do{      
        cin>>a;
      if(a<0)
        break;
        insert(&root,a);
    }while(1);
    cout<<"Diameter of the given binary tree is "<<verticalSum(root); 

 
    return 0;
}