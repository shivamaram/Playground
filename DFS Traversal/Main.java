#include<stdio.h>
#include<stdlib.h>
struct node{
    int vertex;
    struct node* next;
    
};
struct Graph
{
    int numVertices;
    int *visited;
    struct node** adjLists;
    
};
struct Graph *createGraph(int vertices)
{
    struct Graph *graph=malloc(sizeof(struct Graph));
    graph->numVertices=vertices;
    graph->adjLists=malloc(vertices* sizeof(struct node*));
    graph->visited= malloc(vertices*sizeof(int));
    int i;
    for(i=0;i<vertices; i++)
    {
        graph->adjLists[i]=NULL;
        graph->visited[i]=0;
    }
    return graph;
}
struct  node * createNode(int v)
{
    struct node * newNode=malloc(sizeof(struct node));
    newNode->vertex=v;
    newNode->next=NULL;
    return newNode;
}
void addEdge(struct Graph * graph,int src,int dest)
{
    struct node* newNode=createNode(dest);
    newNode->next=graph->adjLists[src];
    graph->adjLists[src]=newNode;
    
    newNode=createNode(src);
    newNode->next=graph->adjLists[dest];
    graph->adjLists[dest]=newNode;
}
void DFS(struct Graph * graph,int vertex)
{
    struct node * adjList = graph->adjLists[vertex];
    struct node* temp=adjList;
    graph->visited[vertex]=1;
    printf(" %d",vertex);
    while(temp!=NULL)
    {
        int ConnectedVertex=temp->vertex;
        if(graph->visited[ConnectedVertex]==0)
        {
            DFS(graph,ConnectedVertex);
            
        }
        temp=temp->next;
    }
    
}
int main()
{
    int n,v1,v2;
    scanf("%d",&n);
    scanf("%d %d",&v1,&v2);
    struct Graph * graph=createGraph(n);
    while(v1!=-1 && v2!=-1)
    {
        addEdge(graph,v1,v2);
        scanf("%d %d",&v1,&v2);
    }
    printf("DFS :");
    DFS(graph,0);
    return 0;
}