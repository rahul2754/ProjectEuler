/*
Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and each of a and b are called amicable numbers.

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
 */
package projecteuler;

/**
 *
 * @author Rahul Ramkumar
 */
public class AmicableSum
{
    boolean isAmicable(int x)
    {
        int sum = 0;
        for(int i = 1; i<x; i++)
        {
            if(x%i == 0)
            {
                sum = sum + i;
            }
        }
        
        int s_sum = 0;
        for(int i = 1; i < sum; i++)
        {
            if(sum%i == 0)
            {
                s_sum = s_sum + i;
            }
        }
        
        if(s_sum != sum && s_sum == x)
        {
            return true;
        }
        return false;
    }
    void findSum()
    {
        int sum = 0;
        for(int i = 1; i<= 10000; i++)
        {
            if(isAmicable(i))
            {
                sum = sum + i;                
            }                    
        }
        System.out.println("sum: " + sum);
    }
    
    public static void main(String [] args)
    {
        AmicableSum o1 = new AmicableSum();
        o1.findSum();
    }
        
}
