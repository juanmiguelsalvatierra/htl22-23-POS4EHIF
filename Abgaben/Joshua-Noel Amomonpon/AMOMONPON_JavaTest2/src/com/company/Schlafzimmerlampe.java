package com.company;

public class Schlafzimmerlampe extends Lampe{

    private boolean status;

    public Schlafzimmerlampe(String bezeichnung) {
        super(bezeichnung);
    }

    @Override
    public void sendNotification(String message) {
        String temp = message;

        switch (temp){
            case "L1":
                if (!status){
                    status = true;
                    System.out.println(super.getName() + " ist eingeschalten");
                }

            case "L0":
                if (status){
                    status = false;
                    System.out.println(super.getName() + " ist ausgeschalten");
                }

            case "LW0":
                if (!status){
                    status = true;
                    System.out.println(super.getName() + " ist eingeschalten");
                }

            case "LS1":
                if (!status){
                    status = true;
                    System.out.println(super.getName() + " ist eingeschalten");
                }

            case "LS0":
                if (status){
                    status = false;
                    System.out.println(super.getName() + " ist ausgeschalten");
                }

            case "H0":
                if (status){
                    status = false;
                    System.out.println(super.getName() + " ist ausgeschalten");
                }
        }
    }
}
