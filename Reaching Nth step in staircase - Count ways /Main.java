#include <stdio.h>

/*int find_total_ways_bottom_up(long int n)
{
    if(n == 1) 
    {
        return 1;
    }
    
    if(n == 2)
    {
        return 2;
    }
    
    int n_minus_1th_step, n_minus_2th_step;
    n_minus_1th_step = 2;
    n_minus_2th_step = 1;
    
    int i;
    int total_ways;
    for(i = 3; i <= n; i++)
    {
        total_ways = n_minus_1th_step + n_minus_2th_step;
                     
        n_minus_2th_step = n_minus_1th_step;
        n_minus_1th_step = total_ways;
    }
    
    return total_ways;
}
*/
int find_total_ways_recur(int curr_step, long int n)
{
    if(curr_step > n)
    {
      return 0;
    }
    
    if(curr_step == n)
    {
        return 1;
    }
    
	int total_ways = find_total_ways_recur(curr_step + 1, n) + 
				     find_total_ways_recur(curr_step + 2, n);
    
    return total_ways;
}

int find_total_ways_recur_wrap(int n)
{	
	return find_total_ways_recur(0 /* Starting from step 0 */,
	                             n);
}

int find_total_ways_recur_opt(int curr_step, long int n, int results_cache[])
{
    if(curr_step > n)
    {
      return 0;
    }
  
    if(curr_step == n) 
    {
        return 1;
    }
    
 	if(results_cache[curr_step] != -1)
 	{
 		return results_cache[curr_step];
 	}
	
	int total_ways = find_total_ways_recur_opt(curr_step + 1, n, results_cache) + 
				     find_total_ways_recur_opt(curr_step + 2, n, results_cache);
    
	results_cache[curr_step] = total_ways;
    return total_ways;
}

int find_total_ways_recur_opt_wrap(long int n)
{
	int results_cache[n+1], i;
	for(i = 0; i <= n; i++)
	{
		results_cache[i] = -1;
	}
	
	return find_total_ways_recur_opt(0 /* Starting from step 0 */,
	                                 n,
									 results_cache);
}

int main() {
	long int n;
	scanf("%ld", &n);
	printf("%ld\n", find_total_ways_recur_opt_wrap(n));
	return 0;
}