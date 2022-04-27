package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;


public class CollectionTestSuite {

    private static OddNumbersExterminator oddNumbersExterminator;

    @BeforeEach
    public void before() {
        System.out.println("Test begins");
    }
    @AfterEach
    public void after() {
        System.out.println("Test ended");
    }

    @BeforeAll
    public static void beforeClass() {
        oddNumbersExterminator = new OddNumbersExterminator();
    }

    @DisplayName // tu powinno coś być?


    @Test
    void testOddNumbersExterminatorEmptyList(){

        //Given
        ArrayList<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> newEmptyList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Test of empty list");

        //Then
        Assertions.assertEquals(emptyList, newEmptyList);
    }

    @DisplayName
            ("Test of even/ odd numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);
        newList.add(6);
        newList.add(7);

        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(2);
        resultList.add(4);
        resultList.add(6);


        //When
        List<Integer> newResultList = oddNumbersExterminator.exterminate(newList);

        //Then
        Assertions.assertNotEquals(resultList, newResultList);
    }
}