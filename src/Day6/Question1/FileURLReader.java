package Day6.Question1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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

public class FileURLReader {
    public static List<String> readFileURL(String source) {
        List<String> urls = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = br.readLine()) != null) {
                urls.add(line);
            }
            return urls;
        }
        catch (IOException ex) {
            System.out.println("Error Reading File");
        }
        return null;
    }
}
