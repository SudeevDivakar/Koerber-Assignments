package day3_4.question7;

import java.util.Scanner;

/*
Write a program that accepts (using Scanner ) 2 integers a and b as input and finds the quotient of a/b.

This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this
exception. In the catch block, print the message as shown in the sample output.
Also illustrate the use of finally block. Print the message “Inside finally block”.
Sample Input and Output
1: Enter the 2 numbers 5 2 The quotient of 5/2 = 2 Inside finally block
Sample Input and Output
2: Enter the 2 numbers 5 0 DivideByZeroException caught Inside finally block
 */

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First Number");
            int a = sc.nextInt();
            System.out.println("Enter Second Number");
            int b = sc.nextInt();

            int res = a / b;
            String output = new StringBuilder()
                    .append("The quotient of ").append(a).append("/").append(b)
                    .append(" = ")
                    .append(res).toString();
            System.out.println(output);
        }
        catch (ArithmeticException ex) {
            System.out.println("DivideByZeroException caught");
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
