package com.kodilla.testing.calculator;

import java.util.ArrayList;

public class Prime {
    public boolean isPrime(int number) {
        boolean findOrNot = true;
        for (int i = 2; i < number; i++) {
            //System.out.println(i);
            if (number % i == 0) {
                findOrNot = false;
                return false;
            }

        }
        return findOrNot;
    }

    public static void main(String[] args) {
        Prime prime = new Prime();
        int primeCounter = 0;
        int counter = 1;
        int number = 0;
        int sum = 0;
        while (primeCounter < 100) {
            if(prime.isPrime(++counter)){
                ++number;
                System.out.println("numer " + number + " = " + counter);
                ++primeCounter;
                sum+=counter;
                System.out.println("Suma liczb wynosi = " + sum);
            }
        }
    }
    //System.out.println(prime.isPrime(15));

}

