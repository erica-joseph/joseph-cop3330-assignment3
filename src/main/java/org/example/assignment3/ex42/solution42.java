package org.example.assignment3.ex42;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Erica Joseph
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class solution42 {

    public static void main(String[] args) throws Exception{
        reader("src/main/java/org/example/assignment3/ex42/exercise42_input.txt"); //inser the file into the function
    }//end main

    public static void reader (String filename){
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(filename)); //call in the buffer reader
            ArrayList<String> listOfLines = new ArrayList<>(); //establish an array list to hold the contents
            String line = bufReader.readLine(); //read lines

            while (line != null) { //initiate the while; as long as the file isn't empty
                listOfLines.add(line); //go through the list of lines
                line = bufReader.readLine(); //reading the line of each argument in the notepad

            }
            bufReader.close(); //end

            System.out.printf("%-10s\"%-10s\"%-10s", "Last", "First", "Salary\n"); //format the header to hold last, first and salary

            System.out.println("__________________________"); //partition

            for (String lines : listOfLines) { //for each with lines and lineOfLines
                String[] words = lines.split(","); //creating a partition for the file to separate at the commas
                for (String s : words) { //for each s
                    System.out.printf("%-10s", s);
                }
                System.out.println("");
            }
        }
        catch (Exception e) {
            // Handle it.
        }
    }
}//end readtextfile


