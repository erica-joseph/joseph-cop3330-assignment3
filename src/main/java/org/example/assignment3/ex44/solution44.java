package org.example.assignment3.ex44;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Erica Joseph
 */
import java.io.File;
import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
Request input from user: product name (convert all to lowercase upon input)
Scan file to match the product name in product.java
When the file is found, printout the attrbutes in the line
 */

//JSON is the file format
//GSON is the library
public class solution44 {
    public static void main(String[] args) {

        File input = new File("src/main/java/org/example/assignment3/ex44/exercise44_input.json");

        Scanner inputName = new Scanner(System.in);
        System.out.print("What is the product name? ");

        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input));
            JsonObject fileObject = fileElement.getAsJsonObject();

            //extracting the basic fields
//proccess all
            JsonArray jsonArrayofProducts = fileObject.get("products").getAsJsonArray();
            List<product> products = new ArrayList<>();
            for(JsonElement productElement : jsonArrayofProducts){
                //get the JsonObject
                JsonObject productJsonObject = productElement.getAsJsonObject();
            //can extract
                String name = productJsonObject.get("name").getAsString();
                Double price = productJsonObject.get("price").getAsDouble();
                int quantity = productJsonObject.get("quantity").getAsInt();

                product product = new product(name, price, quantity);
                products.add(product);
                //if(productJsonObject.equals)
            }

            if(inputName.equals("Widget")){
                System.out.printf(" ");
            }
            if(inputName.equals("Thing")){
                System.out.printf(" ");
            }
            if(inputName.equals("Doodad")){
                System.out.printf(" ");
            }

            //print out


            //System.out.printf("Name: %s\n Price: %.2f\n Quantity: %d", product.toString() );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            System.err.println("Sorry, that product was not found in our inventory.");
            e.printStackTrace();
        }

    }
}