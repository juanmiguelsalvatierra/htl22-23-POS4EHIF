package com.company;

public interface IEmailin {
    public void newEmail(String code);
    public void setNext(IEmailin toBeNext);
    public IEmailin getNext();
}
