package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x, y, z;
        x = Integer.parseInt(args[0]);
        y = Integer.parseInt(args[1]);
        z = Integer.parseInt(args[2]);

        if(x == y && x == z && y == z){
            System.out.println("Alle Zahlen haben den selben Wert");
        }
        else{
            if(x == y || x == z || y == z){
                System.out.println("Es haben mindestens 2 Zahlen den selben Wert");
            }
        }
        if(x != y && x != z && y != z){
            System.out.println("Alle Zahlen haben einen unterschiedlichen Wert");
        }
    }
}
