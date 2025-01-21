package day6.question1;

import java.util.List;

/*
Filedownloader use threads for better cpu utilization, we need to create an application to simulate
processing of filedownloader consider we have some photos on dropbox
https://www.dropbox.com/photo1.jpg
https://www.dropbox.com/photo2.jpg
...
...
https://www.dropbox.com/photo25.jpg
Modifify the code to use threads so that performance of application can be improved
 */

public class Main {
    public static void main(String[] args) {
        List<String> urls = FileURLReader.readFileURL("C:\\Users\\sudeev.divakar\\Desktop\\Koerber-Assignments\\src\\Day6\\Question1\\photos.txt");
        if (urls != null) {
            for (String url : urls) {
                DownloadImage downloadImage = new DownloadImage(url);
                Thread thread = new Thread(downloadImage);
                thread.start();
            }
        }
    }
}
