#include<iostream>
using namespace std;
class Clock{
    public:
    int hr,min,sec;
    
};
int main()
{
    Clock c1,c2;
    cout<<"Enter time:\n";
    cout<<"Hours :\n";
    cin>>c1.hr;
    cout<<"Minutes :\n";
    cin>>c1.min;
    cout<<"Seconds :\n";
    cin>>c1.sec;//30
    cout<<"Enter time:\n";
    cout<<"Hours :\n";
    cin>>c2.hr;
    cout<<"Minutes :\n";
    cin>>c2.min;
    cout<<"Seconds :\n";
    cin>>c2.sec;//35
    int total_secs=c1.sec+c2.sec;//65/60=1///65%60=5
    int total_mins=c1.min+c2.min+total_secs/60;
    int total_hrs=c1.hr+c2.hr+total_mins/60;
    cout<<"Time after add: "<<total_hrs<<":"<<total_mins%60<<":"<<total_secs%60;
    return 0;
}