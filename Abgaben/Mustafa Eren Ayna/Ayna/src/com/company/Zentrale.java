package com.company;

import java.util.TimerTask;

public class Zentrale {
    public static void main(String[] args) throws InterruptedException {
        // write your code here
        IEmail [] geraete = new IEmail[6];
        Haus haus = new Haus();
        geraete[0] = new Wohnzimmerlapme("Wohinzimmerlampe 1" , false);
        geraete[1]= new Wohnzimmerlapme("Wohnzimmerlampe 2" , false);
        geraete[2] = new Schlafzimmerlampe("Schlafzimmerlampe 1" , false);
        geraete[3] = new Schlafzimmerlampe("Schlafzimmerlampe 2" , false);
        geraete[4] = new Heizkörper("Heizkörper 1" , false);
        geraete[5] = new Heizkörper("Heizkörper 2" , false);

        for (int i = 0; i < geraete.length ; i++){
            geraete[i].email(haus.getEmail());
        }

    }

}
