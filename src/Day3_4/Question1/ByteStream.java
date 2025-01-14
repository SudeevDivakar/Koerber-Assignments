package Day3_4.Question1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Download photo of your favourite player and save in some folder in a drive. Now write program to copy each
character from that file and store into another file using
FileReader / FileWriter
FileInputStream / FileOutputStream
 */

public class ByteStream {
    public static void copyUsingByteStreams(String source, String destination) {
        try (FileInputStream ips = new FileInputStream(source);
             FileOutputStream ops = new FileOutputStream(destination)) {
            int data;
            while ((data = ips.read()) != -1) {
                ops.write(data);
            }
            System.out.println("Copied using Byte Streams :D");
        } catch (IOException e) {
            System.out.println("Error Reading File");
        }
    }
}
