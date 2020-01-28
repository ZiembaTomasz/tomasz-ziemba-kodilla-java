package com.kodilla.testing.forum.statistics;

public class Petelka {
    public int loop(int x){
        int sum = 0;
        for(int i = 0; i<=x; i++){

            sum+=i;
        }
        return sum;
    }
    public static void main(String[]args){
        Petelka petelka = new Petelka();
        System.out.println(petelka.loop(5));

    }
}
