package com.kodilla.testing.shape;

public class Trojkat implements Shape {
    public String getName(){return "Trojkat";}
    public double getSize(){
        return Math.sqrt(3)*a*a/4;
    }
    double a;
    public Trojkat(double a){
        this.a=a;

    }
}

