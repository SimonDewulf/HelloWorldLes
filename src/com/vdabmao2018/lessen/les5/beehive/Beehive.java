package com.vdabmao2018.lessen.les5.beehive;

public class Beehive {
    public static void main(String[] args) {

        Worker maja = new Worker(100, 10);
        maja.gatherNectar();

        Worker Willy = new Worker(120, 20);


        Soldier varian = new Soldier();
        Soldier saurfang = new Soldier();
        Soldier Tyrande = new Soldier();

        saurfang.name = "High overlord Saurfang";
        varian.name = "king Varian Wrynn";
        Tyrande.name = "Tyrande";

        for(int i = 0; i < 50; i++){
            saurfang.attack(varian);
            if(varian.hitpoints <=0)   {break;}
            Tyrande.heal(varian);

        }



    }

}
