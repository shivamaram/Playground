//0-1 Knapsack problem

#include<stdio.h>
 
// A utility function that returns maximum of two integers
int max(int a, int b) { return (a > b)? a : b; }
 
// Returns the maximum value that can be put in a knapsack of capacity W
int knapSack(int W, int wt[], int val[], int n)
{
   // Base Case
   if (n == 0 || W == 0)
       return 0;
 
   // If weight of the nth item is more than Knapsack capacity W, then
   // this item cannot be included in the optimal solution
   if (wt[n-1] > W)
       return knapSack(W, wt, val, n-1);
 
   // Return the maximum of two cases: 
   // (1) nth item included 
   // (2) not included
   else return max( val[n-1] + knapSack(W-wt[n-1], wt, val, n-1),
                    knapSack(W, wt, val, n-1)
                  );
}
 
// Driver program to test above function
int main()
{
    int a,w,W,i,n;
    //printf("Enter number of values:\n");
    scanf("%d",&a);
    int val[a];
    for(i=0;i<a;i++)
    scanf("%d",&val[i]);
    //printf("Enter the number of weights\n");
    scanf("%d",&w);
    int wt[w];
    for(i=0;i<w;i++)
    scanf("%d",&wt[i]);
    //printf("Enter Weight: ");
    scanf("%d",&W);
    n = sizeof(val)/sizeof(val[0]);
    printf("%d", knapSack(W, wt, val, n));
    return 0;
}

/*

Testcase: 1
Input:
3
60 100 120
3
10 20 30
50

Output:
220

Testcase: 2
Input:
3
20 30 40
3
15 20 30
40

Output:
50

Testcase: 3
Input:
1
50
1
10
25

Output:
50

Testcase: 4
Input:
3
150 300 4500
3
50 90 10
90

Output:
4650

Testcase: 5
Input:
3
220 60 43
2
5 6
40

Output:
280




*/