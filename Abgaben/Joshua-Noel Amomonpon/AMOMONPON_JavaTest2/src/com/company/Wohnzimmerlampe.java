package com.company;

public class Wohnzimmerlampe extends Lampe{

    private boolean status;

    public Wohnzimmerlampe(String bezeichnung) {
        super(bezeichnung);
    }

    @Override
    public void sendNotification(String message) { // sentNotification falls wir eine nachricht bekommen haben, schauen wir nach welches EventCode es ist.
        String temp = message;

        switch (temp){
            case "L1":
                if (!status){
                    status = true;
                    System.out.println( super.getName() + " ist eingeschalten");
                }

            case "L0":
                if (status){
                    status = false;
                    System.out.println(super.getName() + " ist ausgeschalten");
                }

            case "LW1":
                if (!status){
                    status = true;
                    System.out.println(super.getName() + " im eingeschalten");
                }

            case "LW0":
                if (status){
                    status = false;
                    System.out.println(super.getName() + " ist ausgeschalten");
                }

            case "LS0":
                if (!status){
                    status = true;
                    System.out.println(super.getName() + " ist eingeschalten");
                }

            case "H0":
                if (status){
                    status = false;
                    System.out.println(super.getName() + " ist ausgeschalten");
                }

        }

    }
}

