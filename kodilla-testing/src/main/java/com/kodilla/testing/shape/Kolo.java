package com.kodilla.testing.shape;

public class Kolo implements Shape {
    public String getName(){return "koło";}
    public double getSize(){
        return Math.PI*r*r;
    }
        double r;
    public Kolo(double r){
        this.r=r;

    }
}
