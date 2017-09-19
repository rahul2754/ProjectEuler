/*
The prime 41, can be written as the sum of six consecutive primes:

41 = 2 + 3 + 5 + 7 + 11 + 13
This is the longest sum of consecutive primes that adds to a prime below one-hundred.

The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.

Which prime, below one-million, can be written as the sum of the most consecutive primes?
 */
package projecteuler;

/**
 *
 * @author Rahul Ramkumar
 */
public class ConsecutivePrimeSum 
{
     boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n == 3) {
            return true;
        }
        for (int i = 3; i <= n / 2 + 1; i += 2) {
            if (n % 2 == 0 || n % i == 0) {
                return false;
            }
        }
        return true;
    }
        
    int [] getPrimes(int limit)
    {
        int [] primes = new int[limit];
        int num = 1,index = 0;
        
        while(true)
        {
            if(index == limit)
            {
                break;
            }
            if(isPrime(num))
            {
                primes[index] = num;
                index++;
            }
            num++;
        }
        return primes;
    }
    
    int findCount(int [] primes,int prime)
    {
        int sum = 0;
        int count = 0;
        boolean done = false;
        for(int a = 0; a<primes.length; a++)
        {
            for(int j = a; j<primes.length; j++)
            {
                sum = sum + primes[j];
                count++;
                if(sum == prime)
                {
                    return count;
                
                }
                else if(sum > 1000000)
                {
                    sum = 0;
                    count = 0;
                    break;
                }                    
            }                                         
        } 
        return count;
    }
    
    void check(int [] primes)
    {
        int count,max = 0;
        for(int i = 41; i<1000000; i++)
        {
            if(isPrime(i))
            {
               count = findCount(primes,i);
               
               if(count > 1)
               {
                   if(count > max)
                   {
                       System.out.println("count: " + count);
                       System.out.println("sum: " + i);
                       System.out.println();
                       max = count;
                   }
                   
               }
            }
        }
        System.out.println("Max: " + max);
    }
    
    public static void main(String [] args)
    {
        ConsecutivePrimeSum o1 = new ConsecutivePrimeSum();
        int [] primes = o1.getPrimes(1000);
        
        o1.check(primes);
        
    }
}
