package com.company.Expressions5_1;

import java.sql.SQLOutput;

public class RandomNumber {
    public static void main(String[] args) {

        //formule: math.random *(maximum - minimum) + minimum
        //vb: tussen 5 & 10
        double randomDouble = (Math.random() * 5+5);
        System.out.println(randomDouble);



    }
}
