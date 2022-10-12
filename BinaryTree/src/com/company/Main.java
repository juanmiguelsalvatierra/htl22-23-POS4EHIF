package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BBaum b = new BBaum();
        b.add(100);
        b.add(50);
        b.add(200);
        b.add(300);
        b.add(150);
        b.ausgabe();
        System.out.println(b.getHeight());
    }
}
