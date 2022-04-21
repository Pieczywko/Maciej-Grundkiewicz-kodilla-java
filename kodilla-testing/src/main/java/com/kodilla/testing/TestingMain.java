package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        int a = 10;
        int b = 10;

        int add = calculator.getAdd();
        if (add == 20) {
            System.out.println("test ok");
        }else{
            System.out.println("Error!");
        }
        int substract = calculator.getSubstract();
        if (substract== 0) {
            System.out.println("test OK");
        }else{
            System.out.println("Error!");
        }

    }
}

