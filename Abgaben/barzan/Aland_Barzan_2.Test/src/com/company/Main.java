package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String s;
        Scanner scanner=new Scanner(System.in);
        s=scanner.nextLine();



        Haus haus = new Haus();
        haus.addListener(new Wohnzimmerlampe("LW1"));
        haus.addListener(new Wohnzimmerlampe("LW2"));
        haus.addListener(new Schlafzimmerlampe("LS1"));
        haus.addListener(new Schlafzimmerlampe("LS2"));
        haus.addListener(new Heizung("H1"));
        haus.addListener(new Heizung("H2"));
        haus.addMessage(s);


    }
}
