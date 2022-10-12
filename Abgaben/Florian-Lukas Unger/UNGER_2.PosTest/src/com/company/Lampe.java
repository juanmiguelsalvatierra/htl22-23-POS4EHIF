package com.company;

public class Lampe implements IEmailin{
    private String name;
    private boolean on;
    private IEmailin next;

    public Lampe(String name){
        this.name = name;
        this.on = false;
    }

    public boolean getOn(){
        return this.on;
    }

    public void setOn(boolean toBeOn){
        this.on = toBeOn;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String toBeName){
        this.name = name;
    }

    @Override
    public IEmailin getNext(){
        return this.next;
    }

    @Override
    public void newEmail(String code) {

    }

    @Override
    public void setNext(IEmailin toBeNext) {
        this.next = toBeNext;
    }
}
