package com.company.Iterations;

public class HarmonicSum {
    public static void main(String[] args) {

        double sum = 0;
        for(double i = 1; i < 50001; i++){
            sum = sum + 1/i;
        }
        System.out.println(sum);


        double sum2 = 0;

        for(double i = 50000; i > 0; i--){
            sum2 = sum2 + 1/i;
        }
        System.out.println(sum2);

        //da klopt ier echt langs geen kantn... uitkomst zou 2 of onder 2 moeten zijn...
    }
}
