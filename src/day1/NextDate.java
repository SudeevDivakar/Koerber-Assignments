package day1;

/*
Write a program to find next date
Input : enter day: 31
enter month: 12
enter year : 2022
today date: 31/12/2022
Next date: 1/1/2023
*/

import java.util.Scanner;

public class NextDate {
    public static boolean isLeapYear(int year) {
        return ((year % 400 == 0 || year % 100 != 0) && (year % 4 == 0));
    }

    public static int getDays(int month, int year) {
        int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            months[1] = 29;
        }
        return months[month - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Day, Month and Year");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        day++;
        if (day > getDays(month, year)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        System.out.println("Next Date is: " + day + "/" + month + "/" + year);
    }
}

