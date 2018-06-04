package com.vdabmao2018.lessen.les5.beehive;

public class Soldier {
    int hitpoints = 100;
    String weapon;
    int armor = 10;
    String name;


    public void heal(Soldier patient){
        System.out.println(this.name + " heals " + patient.name + " with the gift of the light");
        patient.hitpoints += 20;

    }

    public void attack(Soldier victim){


        System.out.println(this.name + " attacks " + victim.name + " with vigour, wounding him greatly");
        victim.hitpoints = victim.hitpoints - 40 + armor;
        victim.isDead();


    }

    public boolean isDead(){

            boolean isDead = false;

            if(hitpoints <=0) {
                System.out.println(name + " succumbs to his wounds and dies in an agony that will frighten his descendants for generations to come");
                isDead = true;

            }
            return isDead;

    }







}
