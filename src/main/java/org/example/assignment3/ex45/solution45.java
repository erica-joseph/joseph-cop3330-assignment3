package org.example.assignment3.ex45;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;
import java.util.Scanner;

public class solution45 {

    public static void main(String[] args)
    {
        replaceAll("src/main/java/org/example/assignment3/ex45/exercise45_input.txt", "utilize", "use");

    }

    static void replaceAll(String filePath, String original, String modified) {

        Scanner output = new Scanner(System.in);//call in the scanner
        System.out.println("What would you like to name your new file?");//prompt user
        String outputFile = "src/main/java/org/example/assignment3/ex45/" +output.next(); //denote the output file after taking input
        String oldContent = "";

        BufferedReader reader = null;

        FileWriter writer = null;

        try
        {
            reader = new BufferedReader(new FileReader("src/main/java/org/example/assignment3/ex45/exercise45_input.txt"));

            String line = reader.readLine();

            while (line != null)
            {
                oldContent = oldContent + line + System.lineSeparator();

                line = reader.readLine();
            }

            String newContent = oldContent.replaceAll(original, modified);


            writer = new FileWriter(outputFile);

            writer.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {

                reader.close();

                writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

    }
}

