package com.company.kaut;

public class Heizkörper implements IEvent{
    private boolean status;
    private String bezeichnung;
    private IEvent next;

    public Heizkörper(boolean status, String bezeichnung){
        this.status = status;
        this.bezeichnung = bezeichnung;
    }

    @Override
    public void L1() {

    }

    @Override
    public void L0() {

    }

    @Override
    public void LW1() {

    }

    @Override
    public void LW0() {

    }

    @Override
    public void LS1() {

    }

    @Override
    public void LS0() {

    }

    @Override
    public void H1() {
        status = true;
        System.out.println(bezeichnung + " ist jetzt an!");
    }

    @Override
    public void H0() {
        status = false;
        System.out.println(bezeichnung + " ist jetzt aus!");
    }

    @Override
    public IEvent getNext() {
        return next;
    }

    @Override
    public void setNext(IEvent e) {
        next = e;
    }
}
