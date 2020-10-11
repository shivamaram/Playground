#include<iostream>
using namespace std;
int sud[9][9];
bool isSafe(int row,int col,int num)
{
    for(int i =0;i<9;i++)
    {
        if(sud[row][i]==num)
        return false;
        if(sud[i][col]==num)
        return false;
    }
    int rowS=row-row%3,colS=col-col%3;
    for(int i=rowS;i<rowS+3;i++)
    {
        for(int j=colS;j<colS+3;j++)
        {
            if(sud[i][j]==num)
            return false;
        }
    }
    return true;
}
bool solvesudoko()
{
    int row,col;
    bool flag=false;
    
    for(row=0;row<9;row++)
    {
        for(col=0;col<9;col++)
        {
            if(sud[row][col]==0)
            {
                flag=true;
                break;
            }
        }
        if(flag)
        break;
    }
    if(!flag)
    {
        return true;
    }
    for(int num=1;num<10;num++)
    {
        if(isSafe(row,col,num))
        {
            sud[row][col]=num;
            if(solvesudoko())
                return true;
            sud[row][col]=0;
        }
    }
    
    return false;
}
int main()
{
    for(int i =0;i<9;i++)
    {
        for(int j=0;j<9;j++)
        {
            cin>>sud[i][j];
        }
    }
   if( solvesudoko())
   {
        for(int i =0;i<9;i++)
    {
        for(int j=0;j<9;j++)
        {
            cout<<sud[i][j];
        }
        cout<<endl;
    }
   }
   else
   {
       cout<<"No";
   }
   return 0;
}