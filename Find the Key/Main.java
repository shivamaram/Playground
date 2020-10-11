#include<iostream>
using namespace std;
int sum = 0;
int count = 4;
int find(int a, int b, int c)
{
	if(count > 0)
	{
		int x = a % 10, y = b % 10, z = c % 10;
		a /= 10; 
		b /= 10;
		c /= 10;
		int fin = 0;
		if(count % 2 == 0)
		{
			fin = x > y && x > z ? x : (y > x && y > z ? y : z);
			sum = sum * 10 + fin; 
		}
		else
		{
			fin = x < y && x < z ? x : (y < x && y < z ? y : z);
			sum = sum * 10 + fin; 
		}
		count--;
		find(a,b,c);
	}
	else
	{
		int temp = 0;
		while(sum>0)
		{
			temp = temp * 10 + (sum % 10);
			sum /= 10;
		}
		return temp;
	}
}
int main()
{
	int a , b , c;
	cin >> a >> b >> c;
	cout << find(a,b,c);
}