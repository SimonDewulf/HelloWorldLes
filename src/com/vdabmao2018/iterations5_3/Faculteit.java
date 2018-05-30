package com.vdabmao2018.iterations5_3;

import java.util.Scanner;

public class Faculteit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");
        int faculty = sc.nextInt();



        for(int i = faculty-1; i > 1; i--){

            faculty = faculty * i;
        }

        System.out.println(faculty);

    }
}
