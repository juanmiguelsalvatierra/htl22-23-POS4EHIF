package com.company;

public class Heizkörper implements IEvent {
    private String[] codes = new String[]{"H0", "H1"};
    private String bezeichnung;
    private boolean status=false;
    private IEvent next;

    public Heizkörper(String bezeichnung) {
        this.bezeichnung=bezeichnung;
    }

    @Override
    public void neueEmail(String code) {
        if (code.equals(codes[0]) && status==true) {
            status=false;
            System.out.println(bezeichnung + " ist jetzt ausgeschaltet");
        }else if (code.equals(codes[1]) && status==false) {
            status=true;
            System.out.println(bezeichnung + " ist jetzt eingeschaltet");
        }
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
