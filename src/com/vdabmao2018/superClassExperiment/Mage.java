package com.vdabmao2018.superClassExperiment;

public class Mage implements Class{
    private String name;
    private Race race;
    private MageSpec mageSpec;

    public Mage(String name, Race race, MageSpec mageSpec) {
        this.name = name;
        this.race = race;
        this.mageSpec = mageSpec;
    }


    public void setMageSpec(MageSpec mageSpec) {
        this.mageSpec = mageSpec;
    }
}
