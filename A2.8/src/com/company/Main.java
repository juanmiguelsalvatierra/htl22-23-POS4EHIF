package com.company;

import java.util.Arrays;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Random generator = new Random();
        int zufallswert = generator.nextInt(100);
        int[] zahlen = new int[zufallswert];
        for (int i = 0; i < zahlen.length; i++){
            zahlen[i] = generator.nextInt(100);
        }
        int temp=0;
        for (int j = 0; j < zahlen.length; j++){
            for (int k = 1; k < zahlen.length; k++){
                if (zahlen[k-1] > zahlen[k]){
                    temp=zahlen[k-1];
                    zahlen[k-1] = zahlen[k];
                    zahlen[k]=temp;

                }
                System.out.println(Arrays.toString(zahlen));
            }
        }
    }
}
