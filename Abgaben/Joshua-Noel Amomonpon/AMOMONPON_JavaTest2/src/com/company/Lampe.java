package com.company;

public abstract class Lampe implements IEvent{
    private String bezeichnung;
    private IEvent next;

    public Lampe(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }

    @Override
    public abstract void sendNotification(String message);

    public void setName(String name){
        this.bezeichnung = name;
    }

    public String getName(){
        return bezeichnung;
    }

    @Override
    public void setNext(IEvent o) {
        this.next = o;
    }

    @Override
    public IEvent getNext() {
        return next;
    }
}
