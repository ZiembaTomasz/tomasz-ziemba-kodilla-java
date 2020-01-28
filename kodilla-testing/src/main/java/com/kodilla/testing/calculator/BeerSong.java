package com.kodilla.testing.calculator;

public class BeerSong {
    public static void main(String [] args){
    String [] lista1 = {"slowko numer 1", "slowko numer 2", "slownko numer 3"};
    String [] lista2 = {"slowko numer11", "slownko numer 12", "slownko numer 13"};
    String [] lista3 = {"slowko numer21", "slownko numer 22", "slownko numer 23"};

    int lista1Dlugosc = lista1.length;
    int lista2Dlugosc = lista2.length;
    int lista3Dlugosc = lista3.length;

        int rnd1 = (int) (Math.random() * lista1Dlugosc);
        int rnd2 = (int) (Math.random() * lista1Dlugosc);
        int rnd3 = (int) (Math.random() * lista1Dlugosc);
        int rnd4 = (int) (Math.random() * lista1Dlugosc);
        int rnd5 = (int) (Math.random() * lista1Dlugosc);
        int rnd6 = (int) (Math.random() * lista1Dlugosc);
        System.out.println(rnd1);
        System.out.println(rnd2);
        System.out.println(rnd3);
        System.out.println(rnd4);
        System.out.println(rnd5);
        System.out.println(rnd6);
    }

}
