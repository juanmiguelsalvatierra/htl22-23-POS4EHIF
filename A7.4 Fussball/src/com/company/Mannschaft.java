package com.company;

public class Mannschaft {
    public final String name;
    public final Trainer trainer;
    public final Torwart torwart;

    public Mannschaft(String name, Trainer trainer, Torwart torwart){
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
    }
}
