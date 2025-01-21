package day3_4.question6;

import java.util.Scanner;

/*
Write a program to accept name and age of a person from the command prompt(passed as arguments when
you execute the class) and ensure that the age entered is >=18 and < 60. Display proper error messages. The
program must exit gracefully after displaying the error message in case the arguments passed are not proper.
(Hint : Create a user defined exception class for handling errors.)
 */

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an age which is >= 18 and < 60:");
            int age = sc.nextInt();
            if (age < 18 || age > 59) {
                throw new InvalidAgeException();
            }
            else {
                System.out.println("Age entered is Valid");
            }
        }
        catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
