package Day5.Question1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/*
create a file story.txt and put some text into it. read that file and find the frequency of each word in the file in the
and print it
 */

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> wordFrequency = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sudeev.divakar\\Desktop\\Koerber-Assignments\\src\\Day5\\Question1\\file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (wordFrequency.get(word) == null) {
                        wordFrequency.put(word, 1);
                    }
                    else {
                        wordFrequency.put(word, wordFrequency.get(word) + 1);
                    }
                }
            }

            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet() ) {
                StringBuilder sb = new StringBuilder()
                        .append(entry.getKey())
                                .append(" - ")
                                        .append(entry.getValue());
                System.out.println(sb.toString());
            }
        }
        catch (IOException ex) {
            System.out.println("Error Reading File");
        }
    }
}
