/*
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
* Find the sum of all the multiples of 3 or 5 below 1000.
*/

*
*
* @author MrRahulRamkumar
*/


/**
 *
 * @author MrRahulRamkumar
 */
public class EvenFibonacci
{
    public static void main (String [] args)
    {
        int sum = 0,evenSum = 2,f = 1,s = 2;
        System.out.println(f);
        System.out.println(s);
        while(sum <= 4000000)
        {
            sum = f + s;
            if(sum % 2 == 0)
            {
                evenSum = evenSum + sum;
                System.out.print(sum + " ");
                System.out.println("EvenSum: " + evenSum);
            }
            f = s;
            s = sum;
        }       
    }
    
}
