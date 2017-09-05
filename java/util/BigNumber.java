/**
 *
 * @author Rahul Ramkumar
 */
public class BigNumber
{

    public int LENGTH = 200; //default value
    
    public BigNumber(int LENGTH)
    {
        this.LENGTH = LENGTH;
    }
       
    
    public byte[] findDifference(byte arr1[], byte arr2[])
    {
        byte [] diff = new byte[LENGTH];
        int count = 0;
	
        for (int i = LENGTH-1; i >= 0; i--)
        {
            if(arr2[i] > arr1[i] && count != numberOfDigits(arr1))
            {
                diff[i] = (byte) (10 + arr1[i] - arr2[i]);
                arr1[i - 1]--;
                count++;
            }
            else 
            {
                diff[i] = (byte) (arr1[i] - arr2[i]);
                count++;
            }            
        }
        return diff;
    }
    
    public byte[] findSum(byte arr1[], byte arr2[])
    {
        byte [] sum = new byte[LENGTH];
        int tempSum = 0,carry = 0;
	
        for (int i = LENGTH-1; i >= 0; i--)
        {
            tempSum = arr1[i] + arr2[i] + carry;
            
            if ((tempSum / 10) >= 1)
            {
                carry = tempSum / 10;
                sum[i] = (byte) (tempSum % 10);
            } 
            else
            {
                sum[i] = (byte) tempSum;
                carry = 0;
            }
        }
        return sum;
    }
    
    public byte [] findProduct(byte [] arr1,byte [] arr2)
    {
        byte[] product = new byte[LENGTH];
        byte [] sum = new byte[LENGTH];
                
        int tempProduct = 0,carry = 0;
              
        for (int i = LENGTH - 1; i >= 0; i--)
        {
            for (int j = LENGTH - 1; j >= 0; j--)
            {
                tempProduct = arr2[i] * arr1[j] + carry;

                if (tempProduct/10 > 1)
                {
                    carry = tempProduct / 10;
                    product[j] = (byte) (tempProduct % 10);
                } 
                else
                {
                    product[j] = (byte) tempProduct;
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
    
    private boolean isNullMatrix(byte [] arr)
    {
        for(int i = 0; i<LENGTH;i++)
        {
            if(arr[i] != 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public int numberOfDigits(byte [] arr)
    {
        boolean flag = false;
        int count = 0;
        for(int i = 0; i<LENGTH; i++)
        {
            if(arr[i] > 0)
            {
                flag =  false;
                count++;
            }
            if(flag)
            {
                count++;
            }
        }
        return count;
    }
    
    private byte [] shiftValues(int shiftValue,byte [] arr)
    {
        for(int i = 0; i<LENGTH-shiftValue; i++)
        {
            arr[i] = arr[i + shiftValue];
            arr[i + shiftValue] = 0;         
        }
        return arr;
    }
    
     public void print(byte [] arr)
    {
        boolean flag = false;
        for(int i = 0; i<LENGTH; i++)
        {
            if(arr[i] > 0) 
            {
                flag = true;
            }    
            if(flag)
            {
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }
    
    public static void main (String [] args)
    {
        BigNumber o1 = new BigNumber(6);
        byte [] arr1 = {0,0,0,0,1,3};
        byte [] arr2 = {0,0,0,0,2,1};
        byte [] arr = o1.findSum(arr1, arr2);
        o1.print(arr);
        System.out.println("Number Of digits: " + o1.numberOfDigits(arr));
    }   
}
