package com.kodilla.stream.portfolio;

import java.util.Arrays;

public class Petla {
    public static void main(String[]args){
        int[] number ={1,1,1};

        while(number[0]< 4 || number[1]< 4 || number[2] < 4) {
            System.out.println("" + number[0] + number[1] + number[2]);
            number[0]++;
        }

    }

}
