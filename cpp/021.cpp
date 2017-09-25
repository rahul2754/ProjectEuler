#include<iostream>
using namespace std;

int div(int num)	//Function returns the value of the sums of perfect divisors of received parameter.
{
	int sum=0;
	for(int i=1;i<num;i++)
	{
		if(num%i==0)	//Checks perfect divisor.
		{
			sum=sum+i;	//If found, increments the sum by the amount.
		}
	}
	return sum;
}
int main()
{
	int sum1=0,sum2=0,final_sum=0;
	for(int i=1;i<10000;i++)
	{
		sum1=div(i);	//The first number's sum of divisors.
		sum2=div(sum1);	//The inital sum's own sum of divisors.
		if(sum1==sum2) //By given condition, a!=b therefore is both sums are equal, move onto next part of the loop.
		{
			continue;
		}
		if(i==sum2)
		{
			final_sum= final_sum+sum2;	//If the very number tested = it's divisor's sum's sum of divisors, then note d(b) = a when a!=b.
	}
	cout<<final_sum;
}
