package com.company;

public class Heizkörper implements IEmail{
    private String bezeichnung;
    private boolean eingeschalten;

    public Heizkörper(String bezeichnung, boolean eingeschalten){
        this.bezeichnung = bezeichnung;
        this.eingeschalten = eingeschalten;
    }

    @Override
    public void email(String email) {
        if (email.equals("H1")){
            eingeschalten = true;
            System.out.println("Alle Heizkörper wurden eingeschalten");
        }else{
            if(email.equals("H0")){
                eingeschalten = false;
                System.out.println("Alle Heizkörper wurden ausgeschalten");
            }else{
                System.out.println("Es konnte keine Aktion durchgeführt werden : " + bezeichnung);
            }
        }
    }
}
