/*
You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */

/**
 *
 * @author Rahul Ramkumar
 */

package projecteuler;

public class CountSundays {

    int count(int startYear, int endYear) {
        int count = 0;
        int year = startYear;
        int month;
        int date;
        int days = 2; //days is 1 because 1/1/1917 is a monday
        // 1 - mon, 2 - tue, 3 - wed, 4 - thur, 5 - fri, 6 - sat, 7 - sun  

        int numberOfSundays = 0;

        int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (year = startYear; year <= endYear; year++) {
            if (isLeapYear(year)) {
                arr[1] = 29;
            } else {
                arr[1] = 28;
            }

            for (month = 1; month <= 12; month++) {
                for (date = 1; date <= arr[month - 1]; date++) {
                    if (days == 7) {
                        System.out.println("year: " + year + " month: " + month + " date: " + date + " is a  sunday!!!");
                        days = 0;
                        numberOfSundays++;
                        if (date == 1) {
                            count++;
                        }
                    } else {
                        System.out.println("year: " + year + " month: " + month + " date: " + date);
                    }
                    days++;
                }
            }
        }
        System.out.println("Finished...");
        return count;
    }

    boolean isLeapYear(int year) {
        boolean flag = false;

        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        CountSundays o1 = new CountSundays();
        System.out.println("running...");
        System.out.println(o1.count(1901, 2000));
    }
}
