package pl.noemikrysiakwolanska.Quotes;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestHelper {
    public static String getContent(String url) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse response = client.send(
                    HttpRequest.newBuilder()
                            .uri(URI.create(url))
                            .GET()
                            .build(),
                    HttpResponse.BodyHandlers.ofString());
            return (String) response.body();
        } catch (Exception ex) {
            return "";
        }
    }
}
