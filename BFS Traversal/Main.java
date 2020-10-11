#include<stdio.h>
#include<stdlib.h>
#define SIZE 40
struct node{
    int vertex;
    struct node *next;
};
struct Graph
{
    int numvertices;
    struct node **adjLists;
    int *visited;
};
struct queue{
    int items[SIZE];
    int front;
    int rear;
} ;
struct Graph * createGraph(int vertices)
{
    struct Graph* graph=malloc(sizeof(struct Graph));
    graph->numvertices=vertices;
    graph->adjLists=malloc(vertices*sizeof(struct node*));
    graph->visited=malloc(vertices*sizeof(int));
    int i;
    for(i=0;i<vertices;i++)
    {
        graph->adjLists[i]=NULL;
        graph->visited[i]=0 ;
    }
    return graph;
}
struct node *createNode(int v)
{
    struct node *newNode=malloc(sizeof(struct node));
    newNode->vertex=v;
    newNode->next=NULL;
    return newNode;
}
void addEdge(struct Graph* graph,int src,int dest)
{
    struct node* newNode=createNode(dest);
    newNode->next=graph->adjLists[src];
    graph->adjLists[src]=newNode;
    
    
    newNode=createNode(src);
    newNode->next=graph->adjLists[dest];
    graph->adjLists[dest]=newNode;
}
struct queue* creatQueue()
{
    struct queue* q=malloc(sizeof(struct queue));
    q->front=-1;
    q->rear=-1;
    return q;
}
void enqueu(struct queue* q,int value)
{
    if(q->rear==SIZE-1)
        printf("\nQueue is Full!!");
    else
    {
        if(q->front==-1)
        {
            q->front=0;
        }
        q->rear++;
        q->items[q->rear]=value;
    }
}
int isEmpty(struct queue *q)
{
   if( q->rear==-1)
   return 1;
   else
   return 0;
    
}
int dequeue(struct queue *q)
{
    int item;
    if(isEmpty(q))
    {
        item=-1;
    }
    else
    {
        item=q->items[q->front];
        q->front++;
        if(q->front>q->rear)
        {
            q->front=q->rear=-1;
        }
    }
    return item;
}
void printQueue(struct queue * q)
{
    int i=q->front;
    if(!isEmpty(q))
    {
        for(i=q->front;i<=q->rear;i++)
        {
            printf("%d ",q->items[i]);
        }
    }
}
void bfs(struct Graph * graph,int startVertex)
{
    struct queue *q=creatQueue();
    graph->visited[startVertex]=1;
    enqueu(q,startVertex);
    while(!isEmpty(q))
    {
     int currentVertex=dequeue(q);
     printf(" %d",currentVertex);
     
     struct node *temp=graph->adjLists[currentVertex];
     while(temp)
     {
         int adjVertex=temp->vertex;
         if(graph->visited[adjVertex]==0)
         {
             graph->visited[adjVertex]=1;
             enqueu(q,adjVertex);
         }
         temp=temp->next;
     }
    }
    printQueue(q);
}
int main()
{
    int n,i,v1,v2;
    scanf("%d",&n);
    
    if(n==0)
    {
        printf("Graph doesn't exist");
        return 0;
    }
   struct Graph* graph=createGraph(n);
   scanf("%d %d",&v1,&v2);
   while(v1!=-1 && v2!=-1)
   {
       addEdge(graph,v1,v2);
       scanf("%d %d",&v1,&v2);
   }
   printf("BFS : ");
   bfs(graph,0);
    return 0;
}