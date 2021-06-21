package org.example.assignment3.ex42;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class testingTheory {
    //main
    public static void main(String[] args) {
        try {
            BufferedReader buffBaby = new BufferedReader(new FileReader("src/main/java/org/example/assignment3/ex46/exercise46_input.txt"));
            ArrayList<String> listOfLines = new ArrayList<>();
            String line = buffBaby.readLine();
            while(line != null){
                listOfLines.add(line);
                line = buffBaby.readLine();
            }buffBaby.close();
            ArrayList<String> finishTest = new ArrayList<>();
            for (String lines : listOfLines) { //for each with lines and lineOfLines
                String[] words = lines.split(" "); //creating a partition for the file to separate at the commas
                for (String s : words) { //for each s
                    finishTest.add(s);
                }
                for (String s : finishTest) {
                    int total = Collections.frequency(finishTest, s);
                    String stars = "";
                    for (int k = 0; k < total; k++) {
                        stars += "*";

                    }
                    System.out.println(s + ": " + stars);
                }
            }

        } catch (Exception e) {

        }
    }
}
