package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {

    @DisplayName("Sprawdzamy dodawanie Koła")
    @Test
    void testAddFiguresKola(){
        ShapeCollector collector=new ShapeCollector();
        Kolo k1=new Kolo(5);
        Kolo k2=new Kolo(2);
        Kolo k3=new Kolo(1);
        collector.addShape(k1);
        collector.addShape(k2);
        collector.addShape(k3);
        Shape figZKolektora = collector.getShape(0);
        Assertions.assertEquals(figZKolektora.getName(),k1.getName());
        Assertions.assertEquals(figZKolektora.getSize(),k1.getSize());
    }

    @DisplayName("Sprawdzamy dodawanie Kwadrat")
    @Test
    void testAddFiguresKwadrat(){
        ShapeCollector collector=new ShapeCollector();
        Kolo k4=new Kolo(5);
        Kolo k5=new Kolo(2);
        collector.addShape(k4);
        collector.addShape(k5);
        Assertions.assertEquals(collector.getShape(0).getName(),k4.getName());
        Assertions.assertEquals(collector.getShape(0).getName(),k5.getName());
    }

}
