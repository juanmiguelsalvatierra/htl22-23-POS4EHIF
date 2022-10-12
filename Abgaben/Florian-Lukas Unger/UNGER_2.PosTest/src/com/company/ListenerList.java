package com.company;

public class ListenerList {
    IEmailin current;
    private int howMany;

    public void add(IEmailin newElement){
        if(current == null){
            current = newElement;
            howMany++;
        }else{
            newElement.setNext(current);
            current = newElement;
            howMany++;
        }
    }

    public void forEachElement(String code){
        IEmailin currentForEach = current;
        for (int i = 0; i < howMany; i++) {
            currentForEach.newEmail(code);
            currentForEach = currentForEach.getNext();
        }
    }
}
