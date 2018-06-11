package com.vdabmao2018.superClassExperiment.Chess;

public abstract class Piece {
    private Team color;
    private int[] location = new int[2];

    public Piece(Team color, int[] location) {
        this.color = color;
        this.location = location;
    }

    abstract short[][] move(int[] location);
}
