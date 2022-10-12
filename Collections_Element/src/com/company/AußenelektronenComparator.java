package com.company;


import java.util.Comparator;

public class AußenelektronenComparator implements Comparator<Element> {


    @Override
    public int compare(Element o1, Element o2) {
        return Integer.compare(o1.getElektron(), o2.getElektron());
    }
}
