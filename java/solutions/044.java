/*
The number 3797 has an interesting property. Being prime itself, it is possible to continuously remove digits from left to right, and remain prime at each stage: 3797, 797, 97, and 7. Similarly we can work from right to left: 3797, 379, 37, and 3.

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.
 */

/**
 *
 * @author Rahul Ramkumar
 */
package projecteuler;

class TruncatablePrimes {

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

    boolean checkRL(int arr[], int length) {
        int sum = 0, a = 1;
        for (int i = 0; i < length - 1; i++)//arr.length()-1)
        {
            for (int j = a; j < length; j++)//arr.length-a; j++)
            {
                sum = sum * 10 + arr[j];
            }

            if (isPrime(sum) == false) {
                return false;
            }
            a++;
            sum = 0;
        }
        return true;
    }

    boolean checkLR(int arr[], int length) {
        int sum = 0, a = 1;
        for (int i = 0; i < length - 1; i++)//arr.length()-1)
        {
            for (int j = 0; j < length - a; j++)//arr.length-a; j++)
            {
                sum = sum * 10 + arr[j];
            }

            if (isPrime(sum) == false) {
                return false;
            }
            a++;
            sum = 0;
        }
        return true;
    }

    void findSum() {
        int temp = 0, length, rem = 0, n = 10, count = 0, sum = 0;
        while (true) {
            if (isPrime(n)) {
                temp = n;
                length = 0;
                while (temp != 0) //getting the number of digits
                {
                    length++;
                    temp = temp / 10;
                }
                temp = n;
                int[] arr = new int[length];

                for (int i = length - 1; i >= 0; i--) //putting the digits in an integer array
                {
                    rem = temp % 10;
                    arr[i] = rem;
                    temp = temp / 10;
                }
                if (checkLR(arr, length) && checkRL(arr, length)) {
                    System.out.println(n);
                    sum = sum + n;
                    count = count + 1;
                    if (count == 11) {
                        break;
                    }
                }
            }
            n++;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        TruncatablePrimes o1 = new TruncatablePrimes();
        o1.findSum();
    }
}
