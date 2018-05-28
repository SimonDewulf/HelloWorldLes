package com.company.Conditions5_2;

import java.text.DecimalFormat;

public class PassOrFail {
    public static void main(String[] args) {

        int score = (int)(Math.random() *100);

        if(score>=50){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }



    }
}
