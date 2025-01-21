package day3_4.question2;

/*
Update program 1 using class supporting buffering, calculate and record performance improvement
achieved using it
 */

public class Main {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\sudeev.divakar\\Desktop\\Koerber-Assignments\\src\\Day3_4\\Question2\\Vinicius.jpg";
        String destFileBufferedReader = "C:\\Users\\sudeev.divakar\\Desktop\\Koerber-Assignments\\src\\Day3_4\\Question2\\ViniciusBufferedReader.jpg";
        String destFileByteStream = "C:\\Users\\sudeev.divakar\\Desktop\\Koerber-Assignments\\src\\Day3_4\\Question2\\ViniciusByteStream.jpg";

        ByteStream.copyUsingByteStream(sourceFile, destFileByteStream);
        Buffering.copyUsingBufferedReader(sourceFile, destFileBufferedReader);
    }
}
