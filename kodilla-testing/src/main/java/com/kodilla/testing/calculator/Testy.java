package com.kodilla.testing.calculator;

public class Testy {



    public static int recurency(int n){
        if(n == 1){
            return 1;
        }
        if(n>1){
            return recurency(n - 1) * n;
        }
        return 0;
    }
    public static void main(String[]args){
        /*int number = 6;
        int silnia = 1;
        for(int i = 1; i<=number; i++){
            silnia = i*silnia;
        }
        System.out.println(silnia);

        recurency(2);
        */
        char c = 'a';
        while (c < 'z')
            System.out.print(++c);
    }

}
