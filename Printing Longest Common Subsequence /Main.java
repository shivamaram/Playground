#include<stdio.h>
#include<string.h>

#define MAX(a,b) (a > b) ? a : b

int LCS(char str1[],char str2[],int p1,int p2,int m,int n,int results_cache[][n])
{
    if(str1[p1]=='\0'||str2[p2]=='\0')
    {
        return 0;
    }
    if(results_cache[p1][p2]!=-1)
    {
        return results_cache[p1][p2];
    }
    int lcs_len=0;
    if(str1[p1]==str2[p2])
    {
        lcs_len=1+LCS(str1,str2,p1+1,p2+1,m,n,results_cache);
    }
    else
    {
        int opt1_lcs_len=LCS(str1,str2,p1,p2+1,m,n,results_cache);
        int opt2_lcs_len=LCS(str1,str2,p1+1,p2,m,n,results_cache);
        lcs_len=MAX(opt1_lcs_len,opt2_lcs_len);
    }
  results_cache[p1][p2]=lcs_len;
  return lcs_len;
}

int print_lcs(char str1[], char str2[], 
              int m /* str1 length */, 
              int n /* str2 length */,
              int results_cache[][n])
{
  int i=0,j=0;
  while((i<=m-1)&&(j<=n-1))
  {
      if(str1[i]==str2[j])
      {
          printf("%c",str1[i]);
        i++;
        j++;
      }
      else
      {
          if((i<(m-1))&& (results_cache[i+1][j]>results_cache[i][j+1]))
          {
              i++;
          }
          else
          {
            j++;
          }
      }
  }
  
}

int main()
{
    int i, j;
    
    char str1[100], str2[100];
    scanf("%s %s", str1, str2);
    
    int m = strlen(str1);
    int n = strlen(str2);
    int results_cache[m][n];
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            results_cache[i][j]=-1;
        }
    }
    LCS(str1,str2,0,0,m,n,results_cache);
    print_lcs(str1, str2, m, n,results_cache);
    return 0;
}