package com.cs.workshops.ws3;

import jdk.internal.org.objectweb.asm.tree.FrameNode;

import java.lang.Integer;

public class Fraction {
    private int n;
    private int d;

    public Fraction() {
        this.n = 0;
        this.d = 1;
    }

    public Fraction(int n, int d) {
        boolean NEG = (n < 0 && d > 0) || (d < 0 && n > 0); //check if negative

        n = Math.abs(n);
        d = Math.abs(d); // make values absolute

        for(int i = (int) Math.sqrt(n); i > 0; i--){
            if(n % i == 0 && d % 1 == 0){
                n /= i;
                d /= i; // simplify fraction
            }
        }

        this.n = NEG ? -n : n; // assign negativity
        this.d = d;
    }


    public Fraction(int n, int d, boolean skipSimplify) {
        this.n = n; // assign negativity
        this.d = d;
    }

    public Fraction simplify(int n, int d){
        boolean NEG = (n < 0 && d > 0) || (d < 0 && n > 0); //check if negative

        n = Math.abs(n);
        d = Math.abs(d); // make values absolute

        for(int i = (int) Math.sqrt(n); i > 0; i--){
            if(n % i == 0 && d % 1 == 0){
                n /= i;
                d /= i; // simplify fraction
            }
        }
        return new Fraction(NEG ? -n : n, d, false);
    }

    public Fraction add(Fraction fraction){
        int n = (this.getN() * fraction.getD()) + fraction.getN();
        int d = this.getD() * fraction.getD();

        return new Fraction(n, d);    }

    public Fraction subtract(Fraction fraction){
        int n = (this.getN() * fraction.getD()) - fraction.getN();
        int d = this.getD() * fraction.getD();

        return new Fraction(n, d);
    }

    public boolean isZero(){
        return n == 0;
    }

    public boolean isEqual(Fraction fraction){
        int a = Math.abs(fraction.getN() * this.getD());
        int b = Math.abs(this.getN() * fraction.getD());
        return a == b;
    }

    public int getD() {
        return d;
    }

    public int getN() {
        return n;
    }

    public double getDouble() {
        return (double) n / d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString(){
        return Integer.toString(getD()) + " / " + Integer.toString(getN());
    }

}
