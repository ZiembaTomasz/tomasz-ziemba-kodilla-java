package com.kodilla.testing.calculator;

public class Arrays {
    public static void main(String[]args){
        int tablica1[] = {1, 3, -5, 4};
        int tablica2[] = {1, 4, -5, -2};
        int [] tablica3 = new int[tablica1.length];
        for(int i = 0; i <= 3; i++){
            tablica3[i] += tablica1[i] * tablica2[i];
        }
        System.out.println(tablica3);
    }
}