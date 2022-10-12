package com.company;

public class Heizkörper implements Interface{
    private String bez;
    private boolean status;

    public Heizkörper(String bez, boolean status){
        this.bez = bez;
        this.status = status;
    }

    @Override
    public void Reaktion(String eventcode) {
        if(eventcode.equals("H1")){
            status = true;
            System.out.println("Heizkörper " + bez + " ist jetzt an");
        }
        if(eventcode.equals("H0")){
            status = false;
            System.out.println("Heizkörper " + bez + " ist jetzt aus");
        }
    }
}
