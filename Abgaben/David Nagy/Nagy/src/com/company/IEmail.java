package com.company;

public interface IEmail {
    void aktionDurchführen(String s);
    void setNext(IEmail e);
    IEmail getNext();
}
