package com.company;

public class Main {

    public static void main(String[] args) {
        Woerterbuch wb = new Woerterbuch();

        wb.readFile("text.txt");

        wb.print();
    }
}
