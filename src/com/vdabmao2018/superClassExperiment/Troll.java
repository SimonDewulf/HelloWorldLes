package com.vdabmao2018.superClassExperiment;

public class Troll implements Race{

    Faction faction = new Horde();
    public void passiveRacial(){
        System.out.println("regeneration");
    }
    public void activeRacial(){
        System.out.println("berserker rage/blood frenzy whatever");
    }
}
