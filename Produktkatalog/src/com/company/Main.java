package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        HashMap<Integer, Produkt> produkte = new HashMap<Integer, Produkt>();
        Scanner sc = new Scanner(new File("C:\\.Schule\\POS\\POS4EHIF\\Produktkatalog\\produkte.csv"));
        sc.nextLine();
        while (sc.hasNextLine()){
            String zeile = sc.nextLine();

            String[] zeilenarray = zeile.split(";");
            Integer anr = Integer.parseInt(zeilenarray[1]);
            String command = zeilenarray[0];
            switch (command) {
                case "Add", "Change" -> produkte.put(anr, new Produkt(anr, zeilenarray[2], Integer.parseInt(zeilenarray[3])));
                case "Search" -> System.out.println(produkte.get(anr));
                case "Remove" -> produkte.remove(anr);
            }
        }
    }
}
