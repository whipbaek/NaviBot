import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


class Test{
    static  String key = "x36ncvduc3";
    static String value = "Hyhai1vJR3juhcproYyqp44Y3tTTtPoy4tWBwGOc";

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://naveropenapi.apigw.ntruss.com/map-direction/v1/driving");

        URLConnection connection = url.openConnection();

        connection.setRequestProperty("X-NCP-APIGW-API-KEY-ID", key);
        connection.setRequestProperty("X-NCP-APIGW-API-KEY", value);

        // `HttpURLConnection` connection = (HttpURLConnection) url.openConnection();
        // connection.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream())))
        {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }

        DrivingAPI();
    }

    static void DrivingAPI() throws Exception {

        URL url = new URL("https://naveropenapi.apigw.ntruss.com/map-direction/v1/driving?start=128.51024519999973,35.8208454999996&goal=128.6079907999999,35.890649000000174&option=traoptimal");
        URLConnection urlConnection = url.openConnection();

        urlConnection.setRequestProperty("X-NCP-APIGW-API-KEY-ID", key);
        urlConnection.setRequestProperty("X-NCP-APIGW-API-KEY", value);

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(urlConnection.getInputStream())))
        {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        }
    }


}