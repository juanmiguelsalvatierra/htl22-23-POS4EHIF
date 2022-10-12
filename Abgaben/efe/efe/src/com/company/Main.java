package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Haus h1 = new Haus("Haus 1");
        h1.add(new Schlafzimmerlampe("Schlafzimmerlampe1", false));
        h1.add(new Schlafzimmerlampe("Schlafzimmerlampe 2", false));
        h1.add(new Wohnzimmerlampe("Wohnzimmerlampe 1", false));
        h1.add(new Wohnzimmerlampe("Wohnzimmerlampe 2", false));
        h1.add(new Heizkörper("Heizkörper 1", false));
        h1.add(new Heizkörper("Heizkörper 2", false));
        h1.go();
    }
}
