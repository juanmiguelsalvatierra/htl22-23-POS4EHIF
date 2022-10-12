package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Woerterbuch {
    private Node root = null;

    public void readFile(String path) {
        String data = "";

        try {
            File file = new File(path);
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                data += reader.nextLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Datei nicht gefunden");
            e.printStackTrace();
        }

        data = data.replaceAll("[().,-]","").toUpperCase();

        String[] dataArray = data.split(" ");

        for (int i = 0; i < dataArray.length; i++) {
            add(dataArray[i], i);
        }
    }

    private void add(String wert, int position) {
        wert.toUpperCase();
        root = add(root, wert, position);
    }

    private Node add(Node current, String wert, int position) {
        if (current == null) {
            return new Node(wert, position);
        }

        if (wert.compareTo(current.wert) < 0) {
            current.left = add(current.left, wert, position);
        } else if (wert.compareTo(current.wert) > 0) {
            current.right = add(current.right, wert, position);
        } else {
            current.addPosition(position);
            return current;
        }

        return current;
    }

    public void print() {
        print(root);
    }

    private void print(Node current) {
        if (current == null) {
            return;
        }

        print(current.left);
        System.out.printf(current.wert + current.getPositions() + "\n" );
        print(current.right);
    }
}
