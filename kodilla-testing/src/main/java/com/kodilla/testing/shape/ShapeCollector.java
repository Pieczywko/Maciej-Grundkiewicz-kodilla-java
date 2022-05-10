package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape>shapes=new ArrayList<>();
    public void addShape(Shape s){shapes.add(s);}
    public void removeShape(Shape shape){shapes.remove(shape);}
    public Shape getShape(int i){return shapes.get(i);}
    public String getNames(){

        String ret="";
        for (int i=0; i<shapes.size(); i++){
            ret+=shapes.get(i).getName()+" ";
        }
        return ret;
    }
}
