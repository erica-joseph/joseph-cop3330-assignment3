package org.example.assignment3.ex43;
/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Erica Joseph
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class solution43 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you want a folder for JavaScript?");
        String JavaAn = input.next();
        System.out.println("Do you want a folder for CSS?");
        String CSSAn = input.next();
        String filename = "\\index.html";
        System.out.println("Site name: ");
        String folderName = input.next();
        System.out.println("Author name: ");
        String authorName = input.next();
        siteBuilder(folderName, filename, authorName);

        if(CSSAn.equals("y")) {
            siteBuilder(folderName, "\\css", null);
        }
        if(JavaAn.equals("y")) {
            siteBuilder(folderName, "\\js", null);
        }


    }

    public static void siteBuilder(String folder, String file, String author){
        BufferedWriter bw = null;
        File website = new File("src\\main\\java\\org\\example\\assignment3\\ex43\\" + folder);

        boolean bool = website.mkdir();

        File fileIndex = new File(website+file); //file destination


        try { //try

            System.out.println(fileIndex);
            if (!fileIndex.exists()) {
                fileIndex.createNewFile();
            }

            FileWriter fw = new FileWriter(fileIndex);
            bw = new BufferedWriter(fw);

                String content = "<!DOCTYPE html> \n<html>\n <head>\n<title> " + folder + "</title>\n<meta author=\"" + author + "\">\n <style>\n</style>\n</meta>\n</head>\n<body>\n</body>\n</html>";
                bw.write(content);

            bw.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


        finally
        {
            try{
                if(bw!=null)
                    bw.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }
    }
}
