package com.vdabmao2018.lessen.les4;

import java.util.Arrays;

public class LottoGenerator {
    public static void main(String[] args) {


        //genereer 6 verschillende nummers van 1-45.

//hints: Array.sort()   Arrays.binarySearch()

        int max = 45;
        int min = 1;

        int randomNumber = (int) (Math.random() * (max - min + 1) + min);

        int[] random6 = new int[6];

        for (int i = 0; i < 6; i++) {

            random6[i] = (int) (Math.random() * (max - min + 1) + min);
            for (int j = i + 1; j < 6; j++) {
                if (random6[i] == random6[j]) {
                    i--;
                }
            }
            if (i > 4) {
                for (int j = 0; j < 5; j++) {
                    if (random6[5] == random6[j]) {
                        i--;
                    }
                }
            }

        }
        Arrays.sort(random6);

        for (int i = 0; i < 6; i++) {
            System.out.println(random6[i]);
        }


    }
}
