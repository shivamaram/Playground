#include<iostream>
#include<cstring>
#include<cstdlib>
using namespace std;
void printadjmatrix(int **A,int rows)
{
    int i,j;
    cout<<"Adjacency Matrix Representation:\n";
    for(i=1;i<=rows;i++)
    {
        for(j=1;j<=rows;j++)
        {
            cout<<A[i][j]<<" ";
        }
        cout<<endl;
    }
    
}
int main()
{
    int **A,rows,edges,weight,snode,enode;
    char directed[4];
    cout<<"Please enter the number of nodes in the graph\n";
    cin>>rows;
    cout<<"Please enter the number of edges in the graph\n";
    cin>>edges;
    cout<<"Is the graph directed\n";
    cin>>directed;
    A=(int**)malloc(rows*sizeof(int *));
    for(int i=1;i<=rows;i++)
    *(A+i)=(int*)calloc(rows,sizeof(int));
    printadjmatrix(A,rows);
    for(int i=1;i<=edges;i++)
    {
        cout<<"Enter the start node, end node and weight of edge no "<<i<<endl;
        cin>>snode>>enode>>weight;
        if(strcmp(directed,"yes")==0)
            A[snode][enode]=weight;
        else
        {
        A[snode][enode]=weight;
        A[enode][snode]=weight;
        }
    }
     printadjmatrix(A,rows);
    return 0;
}