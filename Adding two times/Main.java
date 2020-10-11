#include<iostream>
using namespace std;
class Clock
{
  public:
  int hr,min,sec;
};
int main()
{
  Clock c1,c2;
  cin>>c1.hr;
  cin>>c1.min;
  cin>>c1.sec;
  cin>>c2.hr;
  cin>>c2.min;
   cin>>c2.sec;
  int total_sec=c1.sec+c2.sec;
  int total_min=c1.min+c2.min+total_sec/60;
  int total_hrs=c1.hr+c2.hr+total_min/60;
  cout<<total_hrs<<":"<<total_min%60<<":"<<total_sec%60;
  return 0;
}