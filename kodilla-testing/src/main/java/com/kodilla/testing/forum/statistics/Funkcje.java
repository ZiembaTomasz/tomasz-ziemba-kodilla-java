package com.kodilla.testing.forum.statistics;

public class Funkcje {
    int a;
    public Funkcje(int a){
        this.a = a;
    }
    public boolean isOdd(){
        if(a%2 == 0){
            System.out.println( "parzysta!! = " + a);
            return true;
        }
        else{
            System.out.println("nieparzysta =  " +a);
            return false;
        }
    }

    public static void main(String[] args){
        Funkcje funkcje = new Funkcje(8);
        funkcje.isOdd();


    }
}
