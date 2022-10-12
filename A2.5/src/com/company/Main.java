package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a, b, c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        int[] zahlen = new int[]{a, b, c};

        int high, low;
        for (int i = 0; i < zahlen.length; i++){
            for (int j = 0; j < zahlen.length-1; j++){
                if(zahlen[j] > zahlen[j+1]){
                    high = zahlen[j];
                    low = zahlen[j+1];
                    zahlen[j] = low;
                    zahlen[j+1] = high;
                }
            }
        }

        System.out.println(Arrays.toString(zahlen));
    }
}
