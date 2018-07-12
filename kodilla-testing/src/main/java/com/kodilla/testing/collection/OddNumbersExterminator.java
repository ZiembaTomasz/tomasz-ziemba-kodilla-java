package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;


public class OddNumbersExterminator {


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers)
    {
        for(Integer a : numbers) {
            if (a % 2 == 0)
                numbers.add(a);
        }
        return numbers;
    }

}


