package com.company;

import java.util.Stack;

public class Game {
    Stack kartenstapel = new Stack();
    Farbe farbe[] = Farbe.values();
    Wert wert[] = Wert.values();

    public void addCard(){
        for (int i = 1; i < 4; i++) {
            for (int j = 2; j < 15; j++) {
                kartenstapel.push(new PokerKarte(farbe[i], wert[j]));
            }
        }

    }
}


