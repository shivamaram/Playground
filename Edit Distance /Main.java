#include<stdio.h>
#include<string.h>

int MIN(int x, int y, int z)
{
  if(x < y && x < z)
  {
    return x;
  }
  else if(y < z)
  {
    return y;
  }
  else
  {
    return z;
  }
}

int get_min_edit_distance(char str1[], char str2[], 
                          int str1_len, int str2_len,
                          int ptr1, int ptr2)
{
    if(str1[ptr1] == '\0')
    {
        // Insert remaining characters of string 2 to string 1
        return str2_len - ptr2;
    }
    
    if(str2[ptr2] == '\0')
    {
        // Delete remaining characters in string 1
        return str1_len - ptr1;
    }
    
    int min_dist = 0;
    if(str1[ptr1] == str2[ptr2])
    {
        min_dist = get_min_edit_distance(str1, str2,
                                         str1_len, str2_len,
                                         ptr1 + 1, ptr2 + 1);
    }
    else
    {
        // Insert
        int ins_opn_edit_dist = 1 + get_min_edit_distance(str1, str2,
                                             str1_len, str2_len,
                                             ptr1, ptr2 + 1);
        // Delete
        int del_opn_edit_dist = 1 + get_min_edit_distance(str1, str2,
                                             str1_len, str2_len,
                                             ptr1 + 1, ptr2);
                                             
        // Replace
        int rep_opn_edit_dist = 1 + get_min_edit_distance(str1, str2,
                                             str1_len, str2_len,
                                             ptr1 + 1, ptr2 + 1);
        
        min_dist = MIN(ins_opn_edit_dist,
                       del_opn_edit_dist,
                       rep_opn_edit_dist);
    }
    
    return min_dist;
}

int get_min_edit_distance_wrapper(char str1[],  char str2[], 
                                  int str1_len, int str2_len)
{
    return get_min_edit_distance(str1, str2, 
                                 str1_len, str2_len,
                                 0, 0);
}

// With memoization
int get_min_edit_distance_with_memoi(char str1[], char str2[], 
                          int str1_len, int str2_len,
                          int ptr1, int ptr2,
                          int results_cache[][str2_len])
{
    if(str1[ptr1] == '\0')
    {
        // Insert remaining characters of string 2 to string 1
        return str2_len - ptr2;
    }
    
    if(str2[ptr2] == '\0')
    {
        // Delete remaining characters in string 1
        return str1_len - ptr1;
    }
    
    if(results_cache[ptr1][ptr2] != -1)
    {
        return results_cache[ptr1][ptr2];
    }
    
    int min_dist = 0;
    if(str1[ptr1] == str2[ptr2])
    {
        min_dist = get_min_edit_distance(str1, str2,
                                         str1_len, str2_len,
                                         ptr1 + 1, ptr2 + 1);
    }
    else
    {
        // Insert
        int ins_opn_edit_dist = 1 + get_min_edit_distance(str1, str2,
                                             str1_len, str2_len,
                                             ptr1, ptr2 + 1);
        // Delete
        int del_opn_edit_dist = 1 + get_min_edit_distance(str1, str2,
                                             str1_len, str2_len,
                                             ptr1 + 1, ptr2);
                                             
        // Replace
        int rep_opn_edit_dist = 1 + get_min_edit_distance(str1, str2,
                                             str1_len, str2_len,
                                             ptr1 + 1, ptr2 + 1);
        
        min_dist = MIN(ins_opn_edit_dist,
                       del_opn_edit_dist,
                       rep_opn_edit_dist);
    }
    
    results_cache[ptr1][ptr2] = min_dist;
    return min_dist;
}

int get_min_edit_distance_with_memoi_wrapper(char str1[],  char str2[], 
                                              int str1_len, int str2_len)
{
    int i, j;
    int results_cache[str1_len][str2_len];
    for(i = 0; i < str1_len; i++)
    {
        for(j = 0; j < str1_len; j++)
        {
            results_cache[i][j] = -1;
        }
    }
    
    return get_min_edit_distance_with_memoi(str1, str2, 
                                            str1_len, str2_len,
                                            0, 0,
                                            results_cache);
}

int main()
{
  char str1[100];
  char str2[100];
  scanf("%s", &str1);
  scanf("%s", &str2);
  
  printf("%d", 
         get_min_edit_distance_with_memoi_wrapper(str1, str2, 
                                                  strlen(str1), strlen(str2)));
  return 0;
}

