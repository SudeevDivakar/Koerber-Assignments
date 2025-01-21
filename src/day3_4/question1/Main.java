package day3_4.question1;

/*
Download photo of your favourite player and save in some folder in a drive. Now write program to copy each
character from that file and store into another file using
FileReader / FileWriter
FileInputStream / FileOutputStream
 */

public class Main {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\sudeev.divakar\\Desktop\\Koerber-Assignments\\src\\Day3_4\\Question1\\Vinicius.jpg";
        String destFileCharStream = "C:\\Users\\sudeev.divakar\\Desktop\\Koerber-Assignments\\src\\Day3_4\\Question1\\ViniciusCharStream.jpg";
        String destFileByteStream = "C:\\Users\\sudeev.divakar\\Desktop\\Koerber-Assignments\\src\\Day3_4\\Question1\\ViniciusByteStream.jpg";

        CharacterStream.copyUsingCharacterStreams(sourceFile, destFileCharStream);

        ByteStream.copyUsingByteStreams(sourceFile, destFileByteStream);
    }
}
