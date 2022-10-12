package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int asize = Integer.parseInt(args[0]);
        int[][] q = new int[asize][asize];
        Random generator = new Random();
        boolean magquad = true;
        int diag_links = 0;
        int diag_rechts = 0;
        for (int i = 0; i < q.length; i++){
            for (int j = 0; j < q.length; j++){
                q[i][j] = generator.nextInt(5);
            }
        }
        int summe = 0;
        for (int i = 0; i < asize; i++){
            summe += q[i][1];
        }

        for (int i = 0; i < q.length; i++){
            int zsum = 0;
            int ssum = 0;

            for (int j = 0; j < q.length; j++){
                zsum += q[i][j];
                ssum += q[j][i];
            }
            if (zsum != summe || ssum != summe){
                magquad = false;
                break;
            }

            diag_links += q[i][i];
            diag_rechts += q[(asize-1)-i][i];
        }

        if (diag_links != summe || diag_rechts != summe){
            magquad = false;
        }

        if (magquad == true){
            System.out.println("Es ist ein magisches Quadrat");
        }
        if (magquad == false){
            System.out.println("Es ist kein magisches Quadrat");
        }
    }
}
