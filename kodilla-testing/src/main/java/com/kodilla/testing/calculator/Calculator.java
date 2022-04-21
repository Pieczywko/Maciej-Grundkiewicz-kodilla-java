package com.kodilla.testing.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj 1 liczbe: ");
        int a = scan.nextInt();

        System.out.println("podaj 2 liczbe");
        int b = scan.nextInt();

        int add= a+b;
        int substract= a-b;

            System.out.println("wynik dodawania wynosi: ");
            System.out.println(add);

            System.out.println("wynik odejmowania wynosi: ");
            System.out.println(substract);
        }

    }

