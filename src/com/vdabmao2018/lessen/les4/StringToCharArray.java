package com.vdabmao2018.lessen.les4;

import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String upperCaseInput = input.toUpperCase();

        char[] charArray = new char[input.length()];

        //a, e, i, o, u, y
        int[] vowellArray = {0, 0, 0, 0, 0, 0};

        for (int i = 0; i < input.length(); i++ ){
            charArray[i] = upperCaseInput.charAt(i);

        }

        for(int i = 0; i< charArray.length; i++){
//kan ook met nested loop
            switch (charArray[i]){
                case 'A': vowellArray[0]++;
                    break;
                case 'E': vowellArray[1]++;
                    break;
                case 'I': vowellArray[2]++;
                    break;
                case 'O': vowellArray[3]++;
                    break;
                case 'U': vowellArray[4]++;
                    break;
                case 'Y': vowellArray[5]++;
                    break;
                default: break;
            }
        }

        System.out.println("number of A's: " + vowellArray[0]);
        System.out.println("number of E's: " + vowellArray[1]);
        System.out.println("number of I's: " + vowellArray[2]);
        System.out.println("number of O's: " + vowellArray[3]);
        System.out.println("number of U's: " + vowellArray[4]);
        System.out.println("number of Y's: " + vowellArray[5]);
    }
}
