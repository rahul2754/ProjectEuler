//Find the sum of all the multiples of
//3 or 5 below 1000 
#include<iostream>
using namespace std;
int main()
{
	int i,sum=0;
	for(i=3;i<=1000;i++)   //loop to check and add all multiples of 3 or 5
 	{
		if(i%3==0||i%5==0)
		sum=sum+i;
		i++;
	}
	cout<<sum;
	return 0;
		
}
