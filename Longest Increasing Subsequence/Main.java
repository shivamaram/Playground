#include<stdio.h>
int max(int x,int y)
{
    if(x>y)
    return x;
    return y;
}
int longest_increasing_subsequence(int arr[],int N)
{
    int i,j,Lis[50],val=0,max_val=0;
    for(i=0;i<N;i++)
     Lis[i]=1;
    for(i=1;i<N;i++)
    {
        for(j=0;j<N;j++)
        {
            if(arr[i]>arr[j]&&Lis[i]<Lis[j]+1)
            {
                Lis[i]=Lis[j]+1;
            }
        }
        val=Lis[i];
        max_val=max(val,max_val);
    }
    printf("%d",max_val);
}
int main()
{
    int arr[100];
    int N,i;
    scanf("%d",&N);
    for(i=0;i<N;i++)
    {
        scanf("%d",&arr[i]);
    }
    longest_increasing_subsequence(arr,N);
    return 0;
}