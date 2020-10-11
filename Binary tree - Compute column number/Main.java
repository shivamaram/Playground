#include<iostream>
#include<bits/stdc++.h> 
using namespace std;
class node{
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
void verticalSumUtil(node *node, int hd, map<int, int> &Map) 
{ 
    if (node == NULL) return; 
      verticalSumUtil(node->l, hd-1, Map); 

      Map[hd] += node->dat; 
    verticalSumUtil(node->r, hd+1, Map); 
} 
void verticalSum(node *root) 
{ 
    map < int, int> Map; 
    map < int, int> :: iterator it; 
    verticalSumUtil(root, 0, Map); 
    for (it = Map.begin(); it != Map.end(); ++it) 
    { 
        cout << (it->first) << " : "
             << it->second << endl; 
    } 
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
    cout<<"The column wise sum values"<<endl;
  cout<<"C.No : sum"<<endl;
   verticalSum(root); 
    return 0;
}