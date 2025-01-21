package day5.question3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Put data into a file named data.txt, Read from data.txt all the doubles (edited by a user) and display the biggest one.
 */

// Using priority queue
public class Main {
    public static void main(String[] args) {
        Queue<Double> pq = new PriorityQueue<>(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o2.compareTo(o1);
            }
        });
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sudeev.divakar\\Desktop\\Koerber-Assignments\\src\\Day5\\Question3\\data.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                pq.add(Double.parseDouble(line));
            }
            String output = new StringBuilder()
                    .append("Largest double number is: ")
                    .append(pq.peek()).toString();
            System.out.println(output);
        }
        catch (IOException ex) {
            System.out.println("Error Reading from File");
        }
    }
}
