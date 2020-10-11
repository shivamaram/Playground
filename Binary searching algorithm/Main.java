#include<iostream>
using namespace std;
int binary_search(int* arr,int ele, int l, int h,bool* flag)
{
    if(l<=h)
    {
       int mid = (l + h) / 2;
       if(arr[mid] == ele){
           *flag = 1;
           return mid;}
       else{
             if(ele < arr[mid])
                   binary_search(arr, ele, l, mid-1, flag);
             else
                   binary_search(arr, ele, mid+1, h, flag);
            }
    }
}
int main()
{
   int size;
   bool flag;
   cin>>size;
   int* arr = new int[size];
   for(int i = 0; i < size; i++)
       cin>>arr[i];
    int ele;
    cin>>ele;
    int index = binary_search(arr, ele, 0, size-1, &flag);
    if(flag == 0)
       cout<<"Not found";
    else
       cout<<ele<<" found at location "<<index+1<<".";
}
