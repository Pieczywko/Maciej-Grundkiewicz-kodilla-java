package com.kodilla.testing.shape;

public class Kwadrat implements Shape {
    public String getName(){return "Kwadrat";}
    public double getSize(){
        return b*b;
    }
    double b;
    public Kwadrat(double b){
        this.b=b;

    }
}

