package com.company;

public class Heizkoerper implements IEAktion{
    private boolean status;
    private String bezeichnung;

    private final String[] eventCodeAn;
    private final String[] eventCodeAus;


    public Heizkoerper(boolean status, String bezeichnung, String[] eventCodeAn, String[] eventCodeAus) {
        this.status = status;
        this.bezeichnung =  bezeichnung;
        this.eventCodeAn = eventCodeAn;
        this.eventCodeAus = eventCodeAus;
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
