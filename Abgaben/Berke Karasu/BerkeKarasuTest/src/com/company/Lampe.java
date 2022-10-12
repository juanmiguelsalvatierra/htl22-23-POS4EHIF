package com.company;

public class Lampe implements IEvent {
    protected String bezeichnung;
    protected boolean status=false;
    private IEvent next;

    public Lampe(String bezeichnung) {
        this.bezeichnung=bezeichnung;
    }

    @Override
    public void neueEmail(String code) {
        System.out.println(bezeichnung);
    }

    @Override
    public IEvent getNext() {
        return next;
    }

    @Override
    public void setNext(IEvent next) {
        this.next=next;
    }
}
