package Day1;

/*
Write a program called GradesAverage, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the
grades of each of the students and saves them in an int array called grades. Your program shall
check that the grade is between 0 and 100. A sample session is as follow:
Enter the number of students: 3
Enter the grade for student 1: 55
Enter the grade for student 2: 108
Invalid grade, try again...
Enter the grade for student 2: 56
Enter the grade for student 3: 57
The average is: 56.0
*/

import java.util.Scanner;

public class GradesAverage {
    public static boolean checkCorrectGrade(int num) {
        return (num >= 0 && num <= 100);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int total = 0;

        int i = 0;
        while (i < n) {
            System.out.println("Enter Grade for Student");
            int grade = sc.nextInt();
            if(checkCorrectGrade(grade)) {
                arr[i] = grade;
                total = total + grade;
                i++;
            }
            else {
                System.out.println("Invalid Grade, try again...");
            }
        }

        System.out.println("Average Grade is " + ((float)total / n));
    }
}