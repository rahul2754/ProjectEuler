/*
The important part of the code is determining the upper limit of the brute force, taking the digit 9 into consideration, the highest number will be X*9^5 where X is the number of possible digits, also as we note that 9^5 = 59049, we see 5 minumum digits for maximum sum, but then 5*9^5 gives us 6 digits, i.e. 6*9^5 is our upper limit, beyond which the number of digits shall not match sums of power of 9 meaning the number will never be the same after such a point, therefore the value 6*9^5 = 354294 will be our upper limit.
 */

#include <iostream>
#include <cmath>

using namespace std;

bool fifth(long int num)    //Function flags all values that are equal to the sum of their digits to power of fifth.
{
    long int dig, orig, sum = 0;
    orig = num;
    while (num > 0)
    {
        dig = num % 10;
        sum = sum + pow(dig, 5);
        num = num/10;
    }
    return (sum == orig);   //Return TRUE only if original number satisfies condition.
}

int main()
{
    long int finalsum = 0;
    for (long int i=2; i < 354294; i++)     //Limit put in the loop.
    {
        if (fifth(i))
        {
            finalsum += i;  //Final sum incremented.
        }
    }
    cout << "Final sum of all such numbers is: " << finalsum;
    return 0;
}


        
