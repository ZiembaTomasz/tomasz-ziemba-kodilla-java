package com.kodilla.testing.user;

public class Testing {
    public static void main(String[]args){
        StringBuilder s = new StringBuilder("Hello");
        System.out.println(s);
        StringBuilder s1 = s;
        s1.append(" World");
        System.out.println(s);

    }
}
