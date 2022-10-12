package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = Integer.parseInt(args[0]);
        int sum = 0;

        while (x > 0){
            sum += x%10;
            x = x / 10;
        }
        System.out.println(sum);
    }

}
