package com.company.Les2;

import java.util.Scanner;

public class Math_oefeningen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter an integer");
        int x = sc.nextInt();


        double log = (2 * Math.log10(x)) / Math.sqrt(x);

        double area = Math.PI * Math.pow(x, 2);

        double c = 2 * Math.PI * x;

        double y = 2 * x + Math.sin(x / 3);

        double z = (x + 3 * Math.sqrt(x)) / 2;


    }
}
