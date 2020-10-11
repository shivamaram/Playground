#include<stdio.h>
int N;

void printSolution(int sol[N][N])
{
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            printf(" %d ",sol[i][j]);
        }
        printf("\n");
    }
}
int isSafe(int maze[N][N],int x, int y)
{
    if(x>=0 && x< N && y>=0 && y<N&& maze[x][y]==1)
    {
        return 1;
    }
    return 0;
}
int solveMazeUtil(int maze[N][N],int x,int y,int sol[N][N])
{
    if(x==N-1 && y==N-1)
    {
        sol[x][y]=1;
        return 1;
    }
    if(isSafe(maze,x,y)==1)
    {
        sol[x][y]=1;
        if(solveMazeUtil(maze,x+1,y,sol)==1)
        {
            return 1;
        }
         if(solveMazeUtil(maze,x,y+1,sol)==1)
        {
            return 1;
        }
        sol[x][y]=0;
        return 0;
    }
    return 0;
}
void solveMaze(int maze[N][N])
{
    int sol[N][N],i,j;
    for(i=0;i<N;i++)
    {
        for(j=0;j<N;j++)
        {
            sol[i][j]=0;
        }
    }
    
    if(solveMazeUtil(maze,0,0,sol)==0)
    {
        printf("No path");
    }
    printSolution(sol);
}
int main()
{
    printf("Enter n value:\n");
    scanf("%d",&N);
    int maze[N][N],i,j;
    for(i=0;i<N;i++)
    {
        for(j=0;j<N;j++)
        {
            scanf("%d",&maze[i][j]);
        }
    }
    printf("Path to get out of maze\n");
    solveMaze(maze);
return 0;    
}