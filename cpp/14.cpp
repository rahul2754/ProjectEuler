/*
author @ Rahul Rai

The following iterative sequence is defined for the set of positive integers:

n ? n/2 (n is even)
n ? 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 ? 40 ? 20 ? 10 ? 5 ? 16 ? 8 ? 4 ? 2 ? 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

*/#include<iostream>
using namespace std;
int main()
{	int count=0,max=0,num=0;
	for(long long i=1;i<=1000000;i++)
	{
		count =0;
		long long int t=i;
		while(t!=1)
		{
			if(t%2==0)
				t=t/2;
			else
				t=(3*t)+1;
			count++;
		}
		if(count>max-1)
		{
			max=count+1;
			num=i;
		}
	}
	cout<<max<<endl;
	cout<<num;
}
