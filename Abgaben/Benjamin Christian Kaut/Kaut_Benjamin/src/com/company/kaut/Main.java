package com.company.kaut;

public class Main {

    public static void main(String[] args) {
        Haus haus = new Haus();

        haus.addListener(new Wohnzimmerlampe(false, "Wohnzimmerlampe"));
        haus.addListener(new Schlafzimmerlampe(false, "Schlafzimmerlampe"));
        haus.addListener(new Heizkörper(false, "Heizkörper"));

        haus.getEmail("L1");
        //haus.getEmail("L0");
        haus.go();
    }
}
