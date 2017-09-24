#include<iostream>
using namespace std;

int div(int num)
{
	int sum=0;
	for(int i=1;i<num;i++)
	{
		if(num%i==0)
		{
			sum=sum+i;
		}
	}
	return sum;
}
int main()
{
	int sum1=0,sum2=0,final_sum=0;
	for(int i=1;i<10000;i++)
	{
		sum1=div(i);
		sum2=div(sum1);
		if(sum1==sum2)
		{
			continue;
		}
		if(i==sum2)
		{
			final_sum= final_sum+sum2;
		}
	}
	cout<<final_sum;
}
