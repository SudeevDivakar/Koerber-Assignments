package day3_4.question2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Update program 1 using class supporting buffering, calculate and record performance improvement
achieved using it
 */

public class ByteStream {
    public static void copyUsingByteStream (String source, String destination) {
        try (FileInputStream ips = new FileInputStream(source); FileOutputStream ops = new FileOutputStream(destination)) {
            int data;
            long start = System.currentTimeMillis();
            while ((data = ips.read()) != -1) {
                ops.write(data);
            }
            long end = System.currentTimeMillis();

            String output = new StringBuilder()
                    .append("Time taken for Byte Stream: ")
                    .append(end - start)
                    .append("ms").toString();
            System.out.println(output);
        }
        catch (IOException ex) {
            System.out.println("Error Reading File");
        }
    }
}
