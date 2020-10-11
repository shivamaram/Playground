#include<iostream>
using namespace std;

int getoccurence(int a[],int n)
{
	for(int i=0;i<n;i++)
	{
		int count =0;
		for(int j=0;j<n;j++)
		{
			if(a[i]==a[j])
			count++;
		}
		if(count%2!=0)
		{
			return a[i];
		}
	}
	return -1;
}
int main()
{
	int n;
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	cout<<getoccurence(a,n);
	return 0;
}