import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {

    public static int sendGet() throws URISyntaxException, IOException, InterruptedException {

        var client = HttpClient.newHttpClient();
        var url = new URL("https://www.linkedin.com/learning/");
        var request = HttpRequest.newBuilder()
                .GET().uri(url.toURI()).build();

        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.statusCode();
    }
}
