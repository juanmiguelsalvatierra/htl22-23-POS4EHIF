package com.company;

public abstract class Lampe implements Interface{
    private String bez;
    private boolean status;

    public Lampe(String bez, boolean status){
        this.bez = bez;
        this.status = status;
    }

    public String getBez(){
        return bez;
    }

    public void setStatus(boolean newStatus){
        this.status = newStatus;
    }
}
