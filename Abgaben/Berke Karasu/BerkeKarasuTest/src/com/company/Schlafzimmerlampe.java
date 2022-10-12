package com.company;

public class Schlafzimmerlampe extends Lampe {
    private String[] codes = new String[]{"L1", "L0", "LW0", "LS1", "LS0", "H0"};
    public Schlafzimmerlampe(String bezeichnung) {
        super(bezeichnung);
    }

    @Override
    public void neueEmail(String code) {
        switch(code) {
            case "L1":
            case "LW0":
            case "LS1":
                status = true;
                System.out.println(bezeichnung + " ist jetzt eingeschaltet");
                break;
            case "L0":
            case "LS0":
            case "H0":
                status = false;
                System.out.println(bezeichnung + " ist jetzt ausgeschaltet");
                break;
        }
    }
}
