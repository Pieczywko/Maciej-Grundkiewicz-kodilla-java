package com.kodilla.testing.shape;

public class Main {
    public static void main(String[] args) {
        ShapeCollector figures=new ShapeCollector();
        Kolo k1=new Kolo(5);
        Kolo k2=new Kolo(2);
        Kolo k3=new Kolo(1);
        Kwadrat k4= new Kwadrat(3);
        Kwadrat k5= new Kwadrat(1);
        Trojkat k6= new Trojkat(1);
        Trojkat k7= new Trojkat(15);
        figures.addShape(k1);
        figures.addShape(k2);
        figures.addShape(k3);
        figures.addShape(k4);
        figures.addShape(k5);
        figures.addShape(k6);
        figures.addShape(k7);
        System.out.println(figures.getNames());
    }
}
