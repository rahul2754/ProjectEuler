//#002
//By considering the terms in the Fibonacci sequence whose values do not exceed four million,
//find the sum of the even-valued terms.

#include<iostream>
using namespace std;
int main()
{
  long unsigned int c,a=2,sum=0,b=1; 
	while(a<4000000)			//loop for Fibonacci sequence
    {
	   {  
		  if(a%2==0)            //adding all even values of a
		  sum=sum+a;
	   }
	  c=a;					
	  a=a+b;					
	  b=c;
	}
  cout<<"the sum is..."<<sum;
  return 0;
}
