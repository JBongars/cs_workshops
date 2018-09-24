package com.cs.workshops.ws3;

import java.lang.Integer;

public class Fraction {
    private int n;
    private int d;

    public Fraction(int n, int d) {
        this.n = n;
        this.d = d;
    }
    public int getD() {
        return d;
    }

    public int getN() {
        return n;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String toString(){
        return Integer.toString(getD()) + " / " + Integer.toString(getN());
    }

}
