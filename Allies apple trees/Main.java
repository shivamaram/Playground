#include<iostream>
#include<math.h>
using namespace std;

	static int MinimumPerimeter(int NoOfApples) {
      double ApplesInSquare = 0;
      int unit =0;
      while(NoOfApples>ApplesInSquare){
            unit++;
            ApplesInSquare +=12*pow(unit,2);
      }
	  return unit*8;
      }
    int main(){
          int n;
         
          cin>>n;
          cout<<(MinimumPerimeter(n));
     }