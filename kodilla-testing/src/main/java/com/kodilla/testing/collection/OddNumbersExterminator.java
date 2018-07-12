package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;


public class OddNumbersExterminator {


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> odds = new ArrayList<>();
        for (Integer a : numbers) {
            if (a % 2 == 0)
                odds.add(a);
        }
        return odds;
    }
}


