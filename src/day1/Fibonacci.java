package day1;

/*
Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where
F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
The first 20 Fibonacci numbers are:
        1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5
*/

public class Fibonacci {
    public static void printFibonacci(int n) {
        if(n <= 0) {
            System.out.println("No sequence possible");
        }
        else if (n <= 2) {
            if (n == 1) {
                System.out.println('1');
            }
            else {
                System.out.println("1 1");
            }
            System.out.println("Average is 1");
        }
        else {
            int a = 1;
            int b = 1;
            int total = 0;
            System.out.print("1 1 ");
            for (int i = 0; i < n - 2; i++) {
                int c = a + b;
                total = total + c;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
            System.out.println();
            System.out.println("Average is " + ((float)total / n));
        }
    }
    public static void main(String[] args) {
        printFibonacci(20);
    }
}
