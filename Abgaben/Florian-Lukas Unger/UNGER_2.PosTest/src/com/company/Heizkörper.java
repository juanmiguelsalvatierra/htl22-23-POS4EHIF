package com.company;

public class Heizkörper implements IEmailin{
    private IEmailin next;
    private String name;
    private boolean on;

    public Heizkörper(String name){
        this.name = name;
    }


    @Override
    public void newEmail(String code) {
        if(code == "H1"){
            this.on = true;
            System.out.println("The "+this.name+" is on");
        }else if(code == "H0"){
            this.on = false;
            System.out.println("The "+this.name+" is off");
        }
    }

    @Override
    public void setNext(IEmailin toBeNext) {
        this.next = toBeNext;
    }

    @Override
    public IEmailin getNext() {
        return this.next;
    }
}
