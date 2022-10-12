package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        Operation o = new Operation(new Addieren());
        o.addNext(new Operation(new Subtrahieren()));

        for (float i = 0; i <= 5.0f; i += 0.1f){
            o.setValue(i);
            Thread.sleep(1005);
        }

    }
}
