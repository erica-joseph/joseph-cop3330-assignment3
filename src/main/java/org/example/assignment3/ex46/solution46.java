package org.example.assignment3.ex46;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Erica Joseph
 */
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class solution46 {
    //main
    public static void main(String[] args) {
        Scanner("src/main/java/org/example/assignment3/ex46/exercise46_input.txt");


    }

    public static void Scanner(String filePath) {

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(filePath)); //call in the buffer reader
            ArrayList<String> listOfLines = new ArrayList<>(); //establish an array list to hold the contents
            String line = bufReader.readLine(); //read lines


            while (line != null) { //initiate the while; as long as the file isn't empty
                listOfLines.add(line); //go through the list of lines
                line = bufReader.readLine(); //reading the line of each argument in the notepad
            }



            Set<String> unique = new HashSet<String>(listOfLines);
            for (String s : unique) {
                int total = Collections.frequency(listOfLines, s);
                String stars = "";
                for (int k = 0; k < total; k++) {
                    stars += "*";

                }
                System.out.println(s + ": " +stars);

            }

        }catch(Exception e){
            // Handle it.
        }
    }


}
