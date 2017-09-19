/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Rahul Ramkumar
 */
public class TenThousandPrime 
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
    
    void check()
    {
        int n = 1,count = 0;
        while(true)
        {
            if(isPrime(n))
            {
                count++;
                if(count == 10001)
                {
                    System.out.println("count: " + count + " n: " + n);                    
                }
            }
            n++;
        }        
    }
    
    public static void main (String [] args)
    {
        TenThousandPrime o1 = new TenThousandPrime();
        o1.check();
    }
}
