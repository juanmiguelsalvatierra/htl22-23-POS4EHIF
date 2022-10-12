package com.company;

public class Wohnzimmerlampe extends Lampe {
    private String[] codes = new String[]{"L1", "L0", "LW1", "LW0", "LS0", "H0"};

    public Wohnzimmerlampe(String bezeichnung) {
        super(bezeichnung);
    }

    @Override
    public void neueEmail(String code) {
        switch(code) {
            case "L1":
            case "LW1":
            case "LS0":
                if (status == false) {
                    status = true;
                    System.out.println(bezeichnung + " ist jetzt eingeschaltet");
                }
                break;
            case "L0":
            case "LW0":
            case "H0":
                if (status == true) {
                    status = false;
                    System.out.println(bezeichnung + " ist jetzt ausgeschaltet");
                }
                break;
        }
    }
}
