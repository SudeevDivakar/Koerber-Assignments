package day3_4.question2;

import java.io.*;

/*
Update program 1 using class supporting buffering, calculate and record performance improvement
achieved using it
 */

public class Buffering {
    public static void copyUsingBufferedReader(String source, String destination) {
        try(BufferedInputStream br = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(destination))) {
            int data;
            long start = System.currentTimeMillis();
            while((data = br.read()) != -1) {
                bw.write(data);
            }
            long end = System.currentTimeMillis();

            String output = new StringBuilder()
                    .append("Time Taken for Buffered Reader: ")
                    .append(end - start)
                    .append("ms").toString();
            System.out.println(output);
        }
        catch(IOException ex) {
            System.out.println("Error Reading File");
        }
    }
}
