package org.example.assignment3.ex41;

//run exceptions

import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
import java.util.Comparator;

public class solution41{



    public static void main(String[] args) throws Exception{


        BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\erica\\Documents\\idols.txt"));
        ArrayList<String> listOfLines = new ArrayList<>();
        String line = bufReader.readLine();

        while (line != null) { listOfLines.add(line);
            line = bufReader.readLine();
        } bufReader.close();
        System.out.println("Total of " + listOfLines.size() + " names.");

        Collections.sort(listOfLines, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });

        System.out.println("___________________");
        for(String counter: listOfLines){
            System.out.println(counter);
        }


    }

}

