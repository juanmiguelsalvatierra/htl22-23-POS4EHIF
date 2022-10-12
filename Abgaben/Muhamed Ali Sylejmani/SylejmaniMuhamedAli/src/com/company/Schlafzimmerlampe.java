package com.company;

public class Schlafzimmerlampe extends Lampe{

    public Schlafzimmerlampe(boolean status, String bezeichnung, String[] eventCodeAn, String[] eventCodeAus) {
        super(status, bezeichnung, eventCodeAn, eventCodeAus);
    }

    @Override
    public void aktionAufEmail(String eventCode) {
        boolean temp = false;

        for (int i = 0; i < eventCodeAn.length; i++) {
            if (eventCodeAn[i].equals(eventCode)) temp = true;
        }

        if (temp) {
            if (!status) {
                System.out.println(bezeichnung + " ist jetzt an");
                status = true;
            }
            return;
        }

        for (int i = 0; i < eventCodeAus.length; i++) {
            if (eventCodeAus[i].equals(eventCode)) temp = true;
        }

        if (temp) {
            if (status) {
                System.out.println(bezeichnung + " ist jetzt aus");
                status = false;
            }
            return;
        }
    }
}
