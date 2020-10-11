#include <stdio.h>

#define MAX_SIZE 10

int max(int a, int b)
{
    return (a>b) ? a : b;
}

int min(int a, int b)
{
    return (a<b) ? a : b;
}

int get_max_coin(int coin_values[], 
				 int i, 
				 int j)
{
	if(i > j)
	{
		return 0;
	}
	
	if(i == j)
	{
		return coin_values[i];
	}
	
	int me_frt = coin_values[i] + min(get_max_coin(coin_values, i+2, j),
                                      get_max_coin(coin_values, i+1, j-1));
	int me_end = coin_values[j] + min(get_max_coin(coin_values, i+1, j-1),
                                      get_max_coin(coin_values, i, j-2));

    return max(me_frt, me_end);
}

int get_max_coin_wrapper(int coin_values[], int n)
{
	return get_max_coin(coin_values, 0, n-1);
}

// With memoization
int get_max_coin_with_memoi(int coin_values[], 
				 int n,
                 int i, 
				 int j,
                 int results_cache[][n])
{
	if(i > j)
	{
		return 0;
	}
	
	if(i == j)
	{
		return coin_values[i];
	}
    
    if(results_cache[i][j] != -1)
    {
        results_cache[i][j];
    }
	
	int me_frt = coin_values[i] + 
                 min(get_max_coin_with_memoi(coin_values, n, i+2, j,   results_cache),
                     get_max_coin_with_memoi(coin_values, n, i+1, j-1, results_cache));
	int me_end = coin_values[j] + 
                 min(get_max_coin_with_memoi(coin_values, n, i+1, j-1, results_cache),
                     get_max_coin_with_memoi(coin_values, n, i,   j-2, results_cache));

    results_cache[i][j] = max(me_frt, me_end);
    return results_cache[i][j];
}

// With memoization wrapper
int get_max_coin_with_memoi_wrapper(int coin_values[], int n)
{
    int i, j;
    int results_cache[n][n];
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n; j++)
        {
            results_cache[i][j] = -1;
        }
    }
    
	return get_max_coin_with_memoi(coin_values, n, 0, n-1, results_cache);
}

int main()
{
	int coin_values[MAX_SIZE], n, i;
	
	scanf("%d", &n);
	for(i = 0; i < n; i++)
	{
		scanf("%d", &coin_values[i]);
	}
	
	int max_value = get_max_coin_with_memoi_wrapper(coin_values, n);
	printf("%d", max_value);
	
	return 0;
}

