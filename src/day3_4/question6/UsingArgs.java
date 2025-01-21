package day3_4.question6;

/*
Write a program to accept name and age of a person from the command prompt(passed as arguments when
you execute the class) and ensure that the age entered is >=18 and < 60. Display proper error messages. The
program must exit gracefully after displaying the error message in case the arguments passed are not proper.
(Hint : Create a user defined exception class for handling errors.)
 */

public class UsingArgs {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("Invalid number of arguments passed");
            }
            else {
                int age;

                try {
                    age = Integer.parseInt(args[1]);
                }
                catch (Exception ex) {
                    throw new Exception();  //In case age is not a number
                }

                if (age < 18 || age >= 60) {
                    throw new InvalidAgeException();
                }
                System.out.println("Age Entered is Valid");
            }
        }
        catch (InvalidAgeException ex) {
            System.out.println(ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Second Argument is not an integer");
        }
    }
}
