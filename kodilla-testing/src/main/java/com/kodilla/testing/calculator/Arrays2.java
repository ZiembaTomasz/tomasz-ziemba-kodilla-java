package com.kodilla.testing.calculator;

public class Arrays2 {
    public int multiplyArrays(int[]a, int[]b){
        int value = 0;
        int sum = 0 ;

        for (int i = 0 ; i < a.length ; i++)
        {
            value = a[i] * b [i];
            sum = sum +value ;

        }

        return sum;
    }
    public void main(String[]args) {

    }
}
