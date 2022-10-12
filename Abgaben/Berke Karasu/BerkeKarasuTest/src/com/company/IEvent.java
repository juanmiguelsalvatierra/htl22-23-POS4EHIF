package com.company;

public interface IEvent {
    public void neueEmail(String code);
    public IEvent getNext();
    public void setNext(IEvent next);
}
