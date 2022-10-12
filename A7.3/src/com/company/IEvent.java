package com.company;

public interface IEvent {
    void eReden();
    IEvent getNext();
    void setNext(IEvent next);
}
