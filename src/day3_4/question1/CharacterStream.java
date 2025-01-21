package day3_4.question1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Download photo of your favourite player and save in some folder in a drive. Now write program to copy each
character from that file and store into another file using
FileReader / FileWriter
FileInputStream / FileOutputStream
 */

public class CharacterStream {
    public static void copyUsingCharacterStreams(String source, String destination) {
        try (FileReader reader = new FileReader(source); FileWriter writer = new FileWriter(destination)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("Copied using Character Streams :D");
        } catch (IOException e) {
            System.out.println("Error Reading File");
        }
    }
}
