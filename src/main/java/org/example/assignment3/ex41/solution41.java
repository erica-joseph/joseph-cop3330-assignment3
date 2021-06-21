package org.example.assignment3.ex41;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Erica Joseph
 */

import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
import java.util.Comparator;

public class solution41{



    public static void main(String[] args) throws Exception {
        reader("src/main/java/org/example/assignment3/ex41/exercise41_input.txt");
    }

    public static void reader(String fileName){
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(fileName));
            ArrayList<String> listOfLines = new ArrayList<>();
            String line = bufReader.readLine();

            while (line != null) {
                listOfLines.add(line);
                line = bufReader.readLine();
            }
            bufReader.close();
            System.out.println("Total of " + listOfLines.size() + " names.");

            Collections.sort(listOfLines, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s1.compareToIgnoreCase(s2);
                }
            });

            System.out.println("___________________");
            for (String counter : listOfLines) {
                System.out.println(counter);
            }
        }
        catch (Exception e) {

        }


    }

}

