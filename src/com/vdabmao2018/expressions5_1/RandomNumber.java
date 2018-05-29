package com.vdabmao2018.expressions5_1;

public class RandomNumber {
    public static void main(String[] args) {

        //formule: math.random *(maximum - minimum) + minimum
        //vb: tussen 5 & 10
        double randomDouble = (Math.random() * 5 + 5);
        System.out.println(randomDouble);


    }
}
