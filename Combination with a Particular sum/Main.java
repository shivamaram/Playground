#include <stdio.h>
#define MAX_ELEMENTS 40

/*
Once a combination with given sum is found, 
i) we have to inform the previous recurrence calls
ii) Also we have to stop searching furthur

Returning this information can be done in three ways as done below.
Version-1: Using global variable
Version-2: Recurrence function returning the result 
Version-3: Using pointer

Version-1 is not recommended and as it is incorrect way of programming. 
Version-2 and Version-3 both are okay. You should get hold both these ways.

*/

int comb_found = 0;
void is_combination_with_sum_exist_version_1(int a[], int n,
                                            int curr_idx,
                                            int selected[],
                                            int selected_idx,
                                            int sum_val)
{
    if(curr_idx == n)
    {
        int k, comb_sum = 0;
        for(k = 0; k < n; k++)
        {
            if(selected[k] == 1)
            {
                comb_sum = comb_sum + a[k];
            }
        }
        
        if(comb_sum == sum_val)
        {
            comb_found = 1;
        }
        
        return;   
    }
    
    selected[selected_idx] = 1;
    is_combination_with_sum_exist_version_1(a, n,
                                            curr_idx + 1,
                                            selected,
                                            selected_idx + 1,
                                            sum_val);
                                            
    if(comb_found == 1)
    {
        return;
    }
    
    selected[selected_idx] = 0;
    is_combination_with_sum_exist_version_1(a, n,
                                            curr_idx + 1,
                                            selected,
                                            selected_idx + 1,
                                            sum_val);
}

int is_combination_with_sum_exist_version_1_wrapper(int a[], int n, int sum_val)
{
    int selected[MAX_ELEMENTS] = {0};
    is_combination_with_sum_exist_version_1(a, n, 0, selected, 0, sum_val);
    if(comb_found == 1)
    {
        return 1;
    }
    
    return 0;
}

int is_combination_with_sum_exist_version_2(int a[], int n,
                                            int curr_idx,
                                            int selected[],
                                            int selected_idx,
                                            int sum_val)
{
    if(curr_idx == n)
    {
        int k, comb_sum = 0;
        for(k = 0; k < n; k++)
        {
            if(selected[k] == 1)
            {
                comb_sum = comb_sum + a[k];
            }
        }
        
        if(comb_sum == sum_val)
        {
            return 1;
        }
        
        return 0;   
    }
    
    selected[selected_idx] = 1;
    int result = is_combination_with_sum_exist_version_2(a, n,
                                            curr_idx + 1,
                                            selected,
                                            selected_idx + 1,
                                            sum_val);
                                            
    if(result == 1)
    {
        return 1;
    }
    
    selected[selected_idx] = 0;
    result = is_combination_with_sum_exist_version_2(a, n,
                                            curr_idx + 1,
                                            selected,
                                            selected_idx + 1,
                                            sum_val);
    return result;
}

int is_combination_with_sum_exist_version_2_wrapper(int a[], int n, int sum_val)
{
    int selected[MAX_ELEMENTS] = {0};
    return is_combination_with_sum_exist_version_2(a, n, 0, selected, 0, sum_val);
}

void is_combination_with_sum_exist_version_3(int a[], int n,
                                            int curr_idx,
                                            int selected[],
                                            int selected_idx,
                                            int sum_val,
                                            int *comb_found)
{
    if(curr_idx == n)
    {
        int k, comb_sum = 0;
        for(k = 0; k < n; k++)
        {
            if(selected[k] == 1)
            {
                comb_sum = comb_sum + a[k];
            }
        }
        
        if(comb_sum == sum_val)
        {
            *comb_found = 1;
        }
        
        return;   
    }
    
    selected[selected_idx] = 1;
    is_combination_with_sum_exist_version_3(a, n,
                                            curr_idx + 1,
                                            selected,
                                            selected_idx + 1,
                                            sum_val,
                                            comb_found);
                                            
    if(*comb_found == 1)
    {
        return;
    }
    
    selected[selected_idx] = 0;
    is_combination_with_sum_exist_version_3(a, n,
                                            curr_idx + 1,
                                            selected,
                                            selected_idx + 1,
                                            sum_val,
                                            comb_found);
}

int is_combination_with_sum_exist_version_3_wrapper(int a[], int n, int sum_val)
{
    int selected[MAX_ELEMENTS] = {0};
    int comb_found = 0;
    is_combination_with_sum_exist_version_3(a, n, 0, selected, 0, sum_val, &comb_found);
    
    if(comb_found == 1)
    {
        return 1;
    }
    
    return 0;
}

int main()
{
    int a[MAX_ELEMENTS], n, i;
    scanf("%d", &n);
    
    for(i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    
    int sum_val;
    scanf("%d", &sum_val);
    
    printf("Combination Found = %d", is_combination_with_sum_exist_version_2_wrapper(a, n, sum_val));
}