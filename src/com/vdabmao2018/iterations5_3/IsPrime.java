package com.vdabmao2018.iterations5_3;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean isPrime = true;

        for(int i = 2; i <= input/2; i++){

            if(input%i ==0){
                isPrime = false;

                System.out.println(input + " can be divided by: " + i);
            }
        }
        System.out.println(isPrime);

    }
}
