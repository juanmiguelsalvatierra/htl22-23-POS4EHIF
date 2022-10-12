package com.company;

public class Mensch implements IEvent{
    public int nr;
    IEvent next;

    public Mensch(int nr){
        this.nr = nr;
    }
    @Override
    public void eReden() {
        System.out.println(nr + " test");
    }

    @Override
    public IEvent getNext() {
        return next;
    }

    @Override
    public void setNext(IEvent next) {
        this.next = next;
    }
}
