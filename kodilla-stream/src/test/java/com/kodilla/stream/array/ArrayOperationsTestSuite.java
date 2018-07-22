package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;



public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        int[] numbers = new int[20];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 4;
        numbers[5] = 5;
        numbers[6] = 6;
        numbers[7] = 7;
        numbers[8] = 8;
        numbers[9] = 9;
        numbers[10] = 30;
        numbers[11] = 11;
        numbers[12] = 12;
        numbers[13] = 13;
        numbers[14] = 40;
        numbers[15] = 15;
        numbers[16] = 16;
        numbers[17] = 17;
        numbers[18] = 18;
        numbers[19] = 19;

        double result = ArrayOperations.getAverage(numbers);

        Assert.assertEquals(11.8, result, 0.1);

    }
}
