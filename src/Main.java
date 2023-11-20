// First, complete all the stuff in here
// https://github.com/florinpop17/app-ideas/blob/master/Projects/3-Advanced/NASA-Exoplanet-Query.md
// Second adjust it to finish these from the notion
// https://chat.openai.com/c/9ea3b816-f9fd-4fa2-bbea-534e0e9349e3
// Need to make a public GitHub for it

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// We'll need to use NASA TAP Service for data access
// For now I'm simply going to access Planetary Systems, perhaps table extensibility is in the future?
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient testClient = HttpClient.newHttpClient();
        // I wasn't able to get the whole table from a query, it may be possible later
        // For now our queries just need to be succinct. Can work on large queries later
        HttpRequest testRequest = HttpRequest.newBuilder().uri(URI.create("https://exoplanetarchive.ipac.caltech.edu/TAP/sync?query=select+pl_name,pl_masse,ra,dec+from+ps")).build();
        HttpResponse<String> testResponse = testClient.send(testRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(testResponse.body());
    }
}