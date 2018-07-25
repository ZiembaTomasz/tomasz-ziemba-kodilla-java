package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {

        try {
            if(b == 0) {
                throw new ArithmeticException();
            }
            return a / b;
        }finally{
            System.out.println("nie dziel przez zeroo");
        }

    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
