/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 James Moore
 */

package ex44;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        File input = new File("exercise44_input.json");
        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(input) );
            JsonObject fileObject = fileElement.getAsJsonObject();

            JsonArray jsonArrayOfProducts = fileObject.get("products").getAsJsonArray();
            ArrayList<Products> products = new ArrayList<Products>();
            for (JsonElement productElement : jsonArrayOfProducts){
                JsonObject productJsonObject = productElement.getAsJsonObject();
                String name = productJsonObject.get("name").getAsString();
                double price = productJsonObject.get("price").getAsDouble();
                int quantity = productJsonObject.get("quantity").getAsInt();

                Products product = new Products(name, price, quantity);
                products.add(product);
            }

            ask(products);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static int hasProd(String name, ArrayList<Products> list){
        for (int i = 0; i < list.size(); i++ ){
            if(list.get(i).getName().equals(name) ){
                return i;
            }
        }
        return -1;
    }

    public static void ask(ArrayList<Products> list){
        Scanner inScan = new Scanner(System.in);
        System.out.print("What is the product name? ");
        String value = inScan.next();
        int index = -1;
        while ( (index = hasProd(value, list) ) == -1){
            System.out.print("Product not found.\nWhat is the product name? ");
            value = inScan.next();
        }
        System.out.println(list.get(index).printItem() );
    }
}
