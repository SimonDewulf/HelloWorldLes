package com.vdabmao2018.superClassExperiment.Chess;

public class Board {
    public String[][] board = new String[][]{
            {"0","1","2","3","4","5","6","7"},
            {"0","1","2","3","4","5","6","7"},
            {"0","1","2","3","4","5","6","7"},
            {"0","1","2","3","4","5","6","7"},
            {"0","1","2","3","4","5","6","7"},
            {"0","1","2","3","4","5","6","7"},
            {"0","1","2","3","4","5","6","7"},
            {"0","1","2","3","4","5","6","7"}
    };

    public static void print2DArray(String[][] a) {


        String[] columnsOfa = a[0];
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < columnsOfa.length; j++) {

                System.out.print(a[i][j] + "    ");
            }
        }
        System.out.println();
    }
}
