package Day5.Question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Put data into a file named data.txt, Read from data.txt all the doubles (edited by a user) and display the biggest one.
 */

// Constant space complexity method
public class SpaceOptimized {
    public static void main(String[] args) {
        double res;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sudeev.divakar\\Desktop\\Koerber-Assignments\\src\\Day5\\Question3\\data.txt"))){
            String line;
            res = Double.parseDouble(br.readLine());  // Assuming file is not empty
            while ((line = br.readLine()) != null) {
                res = Math.max(res, Double.parseDouble(line));
            }
            String output = new StringBuilder()
                    .append("Largest double number is: ")
                    .append(res).toString();
            System.out.println(output);
        }
        catch (IOException ex) {
            System.out.println("Error Reading from File");
        }
    }
}
