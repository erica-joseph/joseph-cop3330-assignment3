package org.example.assignment3.ex45;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Erica Joseph
 */
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class solution45 {

    public static void main(String[] args) {
        readingFirst("src/main/java/org/example/assignment3/ex45/exercise45_input.txt");
        replaceAll("src/main/java/org/example/assignment3/ex45/exercise45_input.txt", "utilize", "use");

    }

    static void replaceAll(String filePath, String original, String modified) {

        Scanner output = new Scanner(System.in);//call in the scanner
        System.out.println("What would you like to name your new file?");//prompt user
        String outputFile = "src/main/java/org/example/assignment3/ex45/" + output.next(); //denote the output file after taking input
        String oldContent = "";

        BufferedReader reader = null;

        FileWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader("src/main/java/org/example/assignment3/ex45/exercise45_input.txt"));

            String line = reader.readLine();

            while (line != null) {
                oldContent = oldContent + line + System.lineSeparator();

                line = reader.readLine();
            }

            String newContent = oldContent.replaceAll(original, modified);


            writer = new FileWriter(outputFile);

            writer.write(newContent);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                reader.close();

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void readingFirst(String fileName) {

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(fileName));
            ArrayList<String> listOfLines = new ArrayList<>();
            String line = bufReader.readLine();
            System.out.print("\"...");
            while (line != null) {
                listOfLines.add(line);
                line = bufReader.readLine();
                System.out.println(line);
            }
            bufReader.close();
            System.out.print("...\"");
            System.out.println("\n");
        } catch (Exception e) {

        }
    }
}
