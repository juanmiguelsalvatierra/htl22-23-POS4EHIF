package com.company;

public class Heizkörper implements IEvent{

    private String bezeichnung;
    private boolean status;
    private IEvent next;

    public Heizkörper(String bezeichnung){
        this.bezeichnung = bezeichnung;
    }

    @Override
    public void sendNotification(String message) {
        String temp = message;

        switch (temp){
            case "H1":
                if (!status){
                    status = true;
                    System.out.println(bezeichnung + " ist eingeschalten" + status);
                }

            case "H0":
                if (status){
                    status = false;
                    System.out.println(bezeichnung + " ist ausgeschalten" + status);
                }
        }

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
