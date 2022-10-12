package com.company;

public interface IEvent {
    public void sendNotification(String message);
    public void setNext(IEvent o);
    public IEvent getNext();
}
