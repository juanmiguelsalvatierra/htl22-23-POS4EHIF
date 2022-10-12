package com.company;

public class Gast implements Comparable<Gast>{
    Geschlecht geschlecht;
    Tanzniveau tn;
    String name;

    public Gast(String name, Geschlecht geschlecht, Tanzniveau tn){
        this.name = name;
        this.geschlecht = geschlecht;
        this.tn = tn;
    }

    @Override
    public String toString() {
        return "Gast{" +
                "geschlecht=" + geschlecht +
                ", tn=" + tn +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gast o) {
        return 0;
    }
}
