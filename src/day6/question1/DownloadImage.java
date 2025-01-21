package day6.question1;

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

public class DownloadImage implements Runnable {
    private String url;
    public DownloadImage(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        System.out.println(new StringBuilder(Thread.currentThread().getName()).append(" is downloading ").append(url).toString());
        System.out.println(new StringBuilder(Thread.currentThread().getName()).append(" finished downloading ").append(url).toString());
    }
}
