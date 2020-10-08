package pl.noemikrysiakwolanska.Quotes;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class QuoteTranslation {
    public static String translate(String quote) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse response = client.send(
                    HttpRequest.newBuilder()
                            .uri(URI.create("https://www.tlumaczangielskopolski.pl/wp-content/themes/translatica/inc/translate/translator.php?from=en&to=pl&text=" + URLEncoder.encode(quote, "UTF-8")))
                            .GET()
                            .build(),
                    HttpResponse.BodyHandlers.ofString());
            String content = (String) response.body();
            int indexOfBracketStart = content.indexOf("[");
            int indexOfBracketStop = content.lastIndexOf("]");
            String translation = content.substring(indexOfBracketStart + 2, indexOfBracketStop - 1);
            return translation;
        } catch (Exception e) {
            return "Brak tłumaczenia";
        }
    }


}


