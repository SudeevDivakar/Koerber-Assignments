package Day1;

/*
Create pascal triangle using 2D arrary
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
1 7 21 35 35 21 7 1
*/

import java.util.Scanner;

public class PascalTriangle {
    public static void printTriangle(int n) {
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid number of rows");
        }
        else {
            printTriangle(n);
        }
    }
}

