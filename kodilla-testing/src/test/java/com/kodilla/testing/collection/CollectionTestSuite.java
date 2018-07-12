package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;


public class CollectionTestSuite
{
    @Before
    public void before()
    {
        System.out.println("Test Case: begin");
    }
    @After
    public void after()
    {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList()
    {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer>numbers = new ArrayList<>();
        ArrayList<Integer>oddList = oddNumbersExterminator.exterminate(numbers);
        Assert.assertEquals(numbers.size(), oddList.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList()
    {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(7);
        ArrayList<Integer>oddList = oddNumbersExterminator.exterminate(numbers);
        Assert.assertEquals(numbers% 2 == 0, oddList% 2 == 0);
    }






}



