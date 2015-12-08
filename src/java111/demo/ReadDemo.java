package java111.demo;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Class to demonstrate reading a simple text file
 *
 * @author paulawaite
 * @version 1.0 12/8/15.
 */
public class ReadDemo {

    public static void main(String[] args) {
        BufferedReader input = null;

        try {
            //create a BufferedReader using a hard-coded file
            input = new BufferedReader(new FileReader("sample.txt"));

            String inputLine = "";
            String[] tokenArray = null;
            String token = "";

            //loop through the input file one line at a time
            while (input.ready()) {
                inputLine = input.readLine();
                System.out.println(inputLine);
            }

        } catch (java.io.FileNotFoundException fnfe) {
            System.out.println("Failed to read input file");
            fnfe.printStackTrace();
        } catch (Exception exception) {
            System.out.println("General Error");
            exception.printStackTrace();
        } finally {
            //Don't forget to close!
            try {
                if (input != null) {
                    input.close();
                }
            } catch (java.io.IOException ioe) {
                System.out.println("Failed to close input file");
                ioe.printStackTrace();
            }
        }
    }
}


