#include<iostream>
using namespace std;
#include<math.h>
int main()
{
	long long tri, i,j,k,sum,count;
	for(i=0;i<1000000000;i++)
	{
		count=0;
		 tri=(i*(i+1))/2;
		for(j=1;j<=sqrt(tri)+1;j++)
		{
			
			if(tri%j==0)
			{
				count+=2;
			}
		}
		if(count>500)
			break;
	}
	cout<<tri;
	
}
