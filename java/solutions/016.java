/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?
 */
package projecteuler;

/**
 *
 * @author Rahul Ramkumar
 */
public class PowerDigitSum {

    static int LENGTH = 500;

    int[] findProduct(int[] arr1, int[] arr2) {
        int[] product = new int[LENGTH];
        int[] sum = new int[LENGTH];

        int tempProduct = 0, carry = 0;

        for (int i = LENGTH - 1; i >= 0; i--) {
            for (int j = LENGTH - 1; j >= 0; j--) {
                tempProduct = arr2[i] * arr1[j] + carry;

                if (numberOfDigits(tempProduct) > 1) {
                    carry = tempProduct / 10;
                    product[j] = tempProduct % 10;
                } else {
                    product[j] = tempProduct;
                    carry = 0;
                }
            }
            if ((LENGTH - i - 1) > 0) {
                product = shiftValues(LENGTH - i - 1, product);
            }

            sum = findSum(product, sum);
        }
        return sum;
    }

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

    int test(int num, int pow) {
        int power = 1;
        for (int i = 1; i <= pow; i++) {
            power = power * num;
        }
        return power;
    }

    int[] findPower(int[] number, int pow) {
        int[] power = new int[LENGTH];
        power[LENGTH - 1] = 1;

        for (int i = 1; i <= pow; i++) {
            power = findProduct(power, number);
        }
        return power;
    }

    int[] shiftValues(int shiftValue, int[] arr) {
        for (int i = 0; i < LENGTH - shiftValue; i++) {
            arr[i] = arr[i + shiftValue];
            arr[i + shiftValue] = 0;
        }
        return arr;
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
        System.out.println("Number of digits = " + count);
    }

    int addArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        PowerDigitSum o1 = new PowerDigitSum();
        int[] numberTwo = new int[LENGTH];
        numberTwo[LENGTH - 1] = 2;

        int[] power = o1.findPower(numberTwo, 1000);
        o1.print(power);
        System.out.println("Sum: " + o1.addArray(power));

    }

}
