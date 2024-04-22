import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.stream.Collectors;

public class Scraping {
    public static void main(String[] args) {
        try {
            String link = "https://www.weather.com/";
            URL url = new URL(link);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            InputStream input = conn.getInputStream();
            String encoding = conn.getContentEncoding();
            if (encoding == null) {
                encoding = "UTF-8";
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(input, encoding));
            String result = reader.lines().collect(Collectors.joining("\n"));

            System.out.println(result);

            reader.close(); // Cerrar el BufferedReader
            conn.disconnect(); // Cerrar la conexión HTTP
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
