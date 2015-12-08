package java111.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author paulawaite
 * @version 1.0 12/8/15.
 */
public class WriteDemo {

    public static void main(String[] args) {
        PrintWriter out = null;
        String fileName = "";
        String firstName = "";

        if (args.length == 0) {
            System.out.println("Please add a file name and a first name.");
            return;
        }

        fileName = args[0];
        firstName = args[1];

        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
            out.print("Hello ");
            out.println(firstName);
            out.println("How's it going?");
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}





