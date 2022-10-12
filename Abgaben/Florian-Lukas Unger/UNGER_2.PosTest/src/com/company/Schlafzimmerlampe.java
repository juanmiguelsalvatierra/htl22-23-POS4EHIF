package com.company;

public class Schlafzimmerlampe extends Lampe{

    public Schlafzimmerlampe(String name) {
        super(name);
    }

    @Override
    public void newEmail(String code) {
        if(!super.getOn()){
            if(code == "L1"){
                super.setOn(true);
                System.out.println("The Lamp "+super.getName()+ " is on!");
            }
        }else{
            if(code == "L0") {
                super.setOn(false);
                System.out.println("The Lamp " + super.getName() + " is off!");
            }else if(code == "H0"){
                super.setOn(false);
                System.out.println("The Lamp " + super.getName() + " is off!");
            }
        }
        if(!super.getOn()){
            if(code == "LW0"){
                super.setOn(true);
                System.out.println("The Lamp "+super.getName()+ " is on!");
            }else if(code == "LS1"){
                super.setOn(true);
                System.out.println("The Lamp "+super.getName()+ " is on!");
            }
        }else{
            if(code == "LS 0"){
                super.setOn(false);
                System.out.println("The Lamp "+super.getName()+ " is off!");
            }
        }
    }
}
