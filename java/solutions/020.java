/*
n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!
*/

/**
 *
 * @author Rahul Ramkumar
 */

package projecteuler;

public class FactorialDigitSum 
{

    static int LENGTH = 1000;

    int[] findSum(int arr1[], int arr2[])
    {
        int [] sum = new int[LENGTH];
        int tempSum = 0,carry = 0;
	
        for (int i = LENGTH-1; i >= 0; i--)
        {
            tempSum = arr1[i] + arr2[i] + carry;
            
            if (numberOfDigits(tempSum) > 1)
            {
                carry = tempSum / 10;
                sum[i] = tempSum % 10;
            } 
            else 
            {
                sum[i] = tempSum;
                carry = 0;
            }
        }
        return sum;
    }
    
    int [] findProduct(int [] arr1,int [] arr2)
    {
        int[] product = new int[LENGTH];
        int [] sum = new int[LENGTH];
                
        int tempProduct = 0,carry = 0;
              
        for (int i = LENGTH - 1; i >= 0; i--)
        {
            for (int j = LENGTH - 1; j >= 0; j--)
            {
                tempProduct = arr2[i] * arr1[j] + carry;

                if (numberOfDigits(tempProduct) > 1)
                {
                    carry = tempProduct / 10;
                    product[j] = tempProduct % 10;
                } 
                else
                {
                    product[j] = tempProduct;
                    carry = 0;
                }
            }
            if((LENGTH-i-1) > 0)
            {
                product = shiftValues(LENGTH-i-1,product);
            }
            
            sum = findSum(product,sum);             
        }
        return sum;
    }
    
    int numberOfDigits(int num)
    {
        int count = 0;
        while(num != 0)
        {
            count++;
            num = num/10;
        }
        return count;
    }
    
    int [] shiftValues(int shiftValue,int [] arr)
    {
        for(int i = 0; i<LENGTH-shiftValue; i++)
        {
            arr[i] = arr[i + shiftValue];
            arr[i + shiftValue] = 0;          
        }
        return arr;
    }
    
    int [] findFactorial(int n) //finds n!
    {
        int [] fact = new int[LENGTH];
        fact[LENGTH - 1] = 1;
        
        for(int i = 1;i<=n;i++)
        {
            fact = findProduct(fact,toIntArray(i));            
        }
        return fact;
    }
    
    int [] toIntArray(int num) //puts num into an array of length 'LENGTH'
    {
        int [] arr = new int[LENGTH];
        int index = arr.length-1;
        while(num != 0)
        {
            arr[index] = num%10;
            num = num/10;
            index--;
        }
        return arr;
    }
    
    void print(int [] arr) //prints the inputed array
    {
        boolean flag = false;
        int count = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i] > 0)
            {
                flag = true;                
            }
            if(flag)
            {
                count++;
                System.out.print(arr[i]);
            }
        } 
        System.out.println();
        System.out.println("Number of digits = " + count);
    }
    
    int addArray(int [] arr)
    {
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            sum = sum + arr[i];            
        }
        return sum;
    }
    

    public static void main(String [] args)
    {
        FactorialDigitSum o1 = new FactorialDigitSum();
       
        int [] arr = o1.findFactorial(100);
        o1.print(arr);
        
        System.out.println("Sum = " + o1.addArray(arr));
       
    }

}
