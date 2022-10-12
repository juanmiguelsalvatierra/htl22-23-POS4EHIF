package com.company.kaut;

public interface IEvent {
    void L1();
    void L0();
    void LW1();
    void LW0();
    void LS1();
    void LS0();
    void H1();
    void H0();
    IEvent getNext();
    void setNext(IEvent e);
}
