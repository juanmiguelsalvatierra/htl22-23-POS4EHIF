package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sec = Integer.parseInt(args[0]);
        int stunde = sec / 3600;
        int min = (sec - stunde * 3600) / 60;
        int secnew = (sec - stunde * 3600) - (min * 60);

        System.out.println(stunde);
        System.out.println(min);
        System.out.println(secnew);
    }
}
