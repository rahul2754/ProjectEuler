/*
 The Fibonacci sequence is defined by the recurrence relation:

Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
Hence the first 12 terms will be:

F1 = 1
F2 = 1
F3 = 2
F4 = 3
F5 = 5
F6 = 8
F7 = 13
F8 = 21
F9 = 34
F10 = 55
F11 = 89
F12 = 144
The 12th term, F12, is the first term to contain three digits.

What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
package projecteuler;

/**
 *
 * @author Rahul Ramkumar
 */
public class ThousandDigitFibonacci {

    int LENGTH = 1000;

    int[] findSum(int arr1[], int arr2[]) {
        int[] sum = new int[LENGTH];
        int tempSum = 0, carry = 0;

        for (int i = LENGTH - 1; i >= 0; i--) {
            tempSum = arr1[i] + arr2[i] + carry;

            if (numberOfDigits(tempSum) > 1) {
                carry = tempSum / 10;
                sum[i] = tempSum % 10;
            } else {
                sum[i] = tempSum;
                carry = 0;
            }
        }
        return sum;
    }

    int numberOfDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    void print(int[] arr) //prints the inputed array
    {
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                flag = true;
            }
            if (flag) {
                count++;
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }

    int findNumberOfDigits(int[] arr) {
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                flag = true;
            }
            if (flag) {
                count++;
            }
        }
        return count;
    }

    void findFibonacci() {
        int[] f = new int[LENGTH];
        f[LENGTH - 1] = 1;

        int[] s = new int[LENGTH];
        s[LENGTH - 1] = 1;

        int[] sum = new int[LENGTH];
        int count = 2;

        while (true) {
            sum = findSum(f, s);
            f = s;
            s = sum;
            count++;
            if (findNumberOfDigits(sum) == 1000) {
                System.out.print("The fibonacci number: ");
                print(sum);

                System.out.println("Term: " + count);
                break;

            }
        }
    }

    public static void main(String[] args) {
        ThousandDigitFibonacci o1 = new ThousandDigitFibonacci();
        o1.findFibonacci();
    }

}
