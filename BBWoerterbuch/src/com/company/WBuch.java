package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WBuch {

    public void read(String datei){
        String data = "";

        try {
            File file = new File(datei);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                data += reader.nextLine();
            }
            reader.close();
        } catch (FileNotFoundException error) {
            error.printStackTrace();
        }

        System.out.println(data);
    }

    //public void add()
}
