package java9;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.*;

public class G_HTTP2Client {
    public static void main(String[] args) {
        try(HttpClient httpClient = HttpClient.newHttpClient()) {
            //Builder design pattern : gof : java 8
            HttpRequest req = HttpRequest
                    .newBuilder().
                    uri(new URI("https://www.google.com"))
                    .GET()
                    .build();

            HttpResponse<String> resp = httpClient.send(req, HttpResponse.BodyHandlers.ofString());

            System.out.println("Response : "+resp.body());
            System.out.println(resp.statusCode());
        } catch (URISyntaxException e) {
            System.out.println("url is wrong");
        } catch (IOException e) {
            System.out.println("IO error");
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
}
