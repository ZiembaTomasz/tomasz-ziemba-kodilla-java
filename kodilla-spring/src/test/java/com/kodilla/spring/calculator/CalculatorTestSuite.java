package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @Test
    public void testCalculations(){

        double resultAdd = calculator.add(10, 10);
        double resultSub = calculator.sub(20, 10);
        double resultMul = calculator.mul(10, 10);
        double resultDiv = calculator.div(20, 10);

        Assert.assertEquals(20, resultAdd, 0.1);
        Assert.assertEquals(10, resultSub, 0.1);
        Assert.assertEquals(100, resultMul, 0.1);
        Assert.assertEquals(2, resultDiv, 0.1);
    }
}
