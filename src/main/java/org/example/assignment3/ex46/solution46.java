package org.example.assignment3.ex46;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class solution46 {
    //main

    //counter
        //increment through the text file based on the words the scanner finds.
    //scanner

    public static void Scanner(){
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\erica\\Documents\\OOP\\WarmUp\\src\\main\\java\\org\\example\\idolExample\\ex46\\exercise46_input.txt"));
            ArrayList<String> listOfLines = new ArrayList<>();
            String line = bufReader.readLine();
        }
        catch (Exception e) {
            // Handle it.
        }
    }

}
