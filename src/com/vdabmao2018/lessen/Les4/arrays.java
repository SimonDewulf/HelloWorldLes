package com.vdabmao2018.lessen.Les4;

public class arrays {
    public static void main(String[] args) {



        int[] j = {1, 2, 5, 7, 9, -6, 12, 19, -30, 24};  //arrays zijn vectoren

        //arrays can't be changed in length. the values can be adjusted but not the size.
        //they can be made of any Data Type, meaning Classes AND primitives



        for(int i = 0; i < (j.length); i++){


            System.out.println("index " + i + " contains: " + j[i]);
        }


        String[] stringArray = {"Mark", "Paul", "Marie", "Laura", "Eline", "Karen", "Andreas", "Thomas",};

        for(int i = 0; i < stringArray.length; i++){

            System.out.println("index " + i + " contains: " + stringArray[i]);


        }

        //NIEUWE SOORT LOOP
        //haalt elk element van die array eruit en print deze als string

        //dus in elke loop wordt de string naam overschreven met de volgende index in stringArray.

        //de teller zit achter de schermen => minder ruime voor mistakes

        //dit werkt enkel voor Arrays maar wel elke soort Array

        for(String naam : stringArray){
            System.out.println(naam);
        }

        //array allocation

        //declares an array of 1000 slots
        int[] getallen = new int[1000];

    }
}
