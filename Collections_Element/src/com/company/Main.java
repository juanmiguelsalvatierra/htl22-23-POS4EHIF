package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {



    public static void main(String[] args) {
	// write your code here
        LinkedList<Element> elemente = new LinkedList<Element>();
        /*elemente.add(Element.Flour);
        elemente.add(Element.Natrium);
        elemente.add(Element.Xenon);
        elemente.add(Element.Calcium);*/
        
        Collections.sort(elemente, new AußenelektronenComparator());
        System.out.println(elemente);
    }
}
