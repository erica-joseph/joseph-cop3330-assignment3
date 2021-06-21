package org.example.assignment3.ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class solution43 {
    public static void main(String[] args) {
        BufferedWriter bw = null;



        Scanner input = new Scanner(System.in);
        System.out.println("Site name: ");
        String folderName = input.next();
        File input1 = new File(folderName);

        boolean bool = input1.mkdir();

        if(bool){
            System.out.println("Folder is created successfully");
        }else{
            System.out.println("Error Found!");
        }

        System.out.println("What would you like to name the file?");
        String fileName = input.next()+".txt";
        System.out.println("Author name: ");
        String authorName = input.next();
        File file = new File(fileName);


            try {
            String pathName = "C:\\Users\\erica\\Documents\\"+folderName+"\\" + fileName;

                System.out.println(pathName);
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            System.out.println("File written Successfully");

            String content = "<!DOCTYPE html> \n<html>\n <head>\n<title> "+ folderName + "</title>\n<meta author=\""+authorName+"\">\n <style>\n</style>\n</meta>\n</head>\n<body>\n</body>\n</html>";
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
