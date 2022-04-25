package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

     public static void main(String[] args) {
        Calculator calculator= new Calculator(10,10);

       int add = calculator.add(10,10);
        if (add == 20) {
            System.out.println("test ok");
        }else{
            System.out.println("Error!");
        }
        int subtract = calculator.subtract(10,10);
        if (subtract== 0) {
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }

    }
}

