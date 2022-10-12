package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] monate = new String[]
                {"Amogus", "Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        int x = Integer.parseInt(args[0]);
        if (x < 13)
        {
            System.out.println(monate[x]);
        }
        else{
            System.out.println("Amogus");
        }
    }
}
