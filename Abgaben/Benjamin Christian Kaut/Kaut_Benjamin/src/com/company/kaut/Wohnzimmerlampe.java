package com.company.kaut;

public class Wohnzimmerlampe extends Lampe implements IEvent{

    public Wohnzimmerlampe(boolean status, String bezeichnung) {
        super(status, bezeichnung);
    }

    private IEvent next;

    @Override
    public void L1() {
        super.status = true;
        System.out.println(super.bezeichnung + " ist jetzt an!");
    }

    @Override
    public void L0() {
        super.status = false;
        System.out.println(super.bezeichnung + " ist jetzt aus!");
    }

    @Override
    public void LW1() {
        super.status = true;
        System.out.println(super.bezeichnung + " ist jetzt an!");
    }

    @Override
    public void LW0() {
        super.status = false;
        System.out.println(super.bezeichnung + " ist jetzt aus!");
    }

    @Override
    public void LS1() {

    }

    @Override
    public void LS0() {
        super.status = true;
        System.out.println(super.bezeichnung + " ist jetzt an!");
    }

    @Override
    public void H1() {

    }

    @Override
    public void H0() {
        super.status = false;
        System.out.println(super.bezeichnung + " ist jetzt aus!");
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
