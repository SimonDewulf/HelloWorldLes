package com.vdabmao2018.lessen.les5.beehive;

public class Worker {
    //elke Worker heeft een capacity en een load
    //deze variabelen zijn inherent verbonden aan de worker class

int capacity;
int load;


    //constructors don't have a returntype. plus Capital, because it's the name of the CLass
    //kijk welke variabele naar wat verwijst!


    public Worker(int capacity, int load) {
        this.capacity = capacity;
        this.load = load;
    }

    //NIET STATIC.
    //static betekent dat het een globale functie is. enkel workers doen gatherNectar() => niet nodig daarbuiten
    //non static functies hebben een context nodig. zonder worker-bij kun je geen gatherNectar uitvoeren
    // ==> static methods zijn dus eigenlijk niet object georiënteerd.
    public void gatherNectar(){
        for(int i = 0; i < 10; i++){
            //visit flower
            load +=5;
        }
    }

}
