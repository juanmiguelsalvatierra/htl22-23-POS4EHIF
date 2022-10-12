package com.company;

import java.util.TimerTask;

public class GameControl extends TimerTask {
    public IEvent root;

    public GameControl(){
        add(new Mensch(1));
        add(new Mensch(2));
        add(new Mensch(3));
        add(new Mensch(4));
        add(new Mensch(5));
    }
    @Override
    public void run() {
        IEvent temp = root;
        while (temp != null){
            temp.eReden();
            temp = temp.getNext();
        }
    }

    public void add(IEvent ie){
        if(root == null){
            root = ie;
            return;
        }
        IEvent temp = root;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(ie);
    }
}
