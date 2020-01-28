package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 5);
        if(result == 16) {
            System.out.println("OK");
        }
        else{
            System.out.println("Not ok");
        }
    }
}