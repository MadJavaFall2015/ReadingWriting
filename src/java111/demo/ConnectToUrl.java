package java111.demo;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * This class demonstrates connecting to a url
 * and writing out the response received.
 *
 * @author paulawaite
 * @version 1.0 12/8/15.
 */
public class ConnectToUrl {

    public static void main(String[] args) {
        // Create a string to hold each line of the response
        String line = "";

        // Create a string to hold the entire response.
        String response = "";

        BufferedReader reader = null;


        try {
            URL url = new URL("http://google.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(url.openStream()));

            // iterate over each line in the response.
            while ((line = reader.readLine()) != null) {
                response += line;
            }
            System.out.println("The response was: " + response);

        } catch (MalformedURLException mue) {
            System.out.println("Error: Malformed url: ");
            mue.printStackTrace();
        } catch (IOException ioe) {
            System.out.println("Error: IO exception.");
            ioe.printStackTrace();
        } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException ioe2) {
                        ioe2.printStackTrace();
                    }

                }
        }
    }
}
