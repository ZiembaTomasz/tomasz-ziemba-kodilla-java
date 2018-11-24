package com.kodilla.patterns2.decorator.pizza;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrder(){
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        BigDecimal calculated = pizzaOrder.getCost();

        assertEquals(new BigDecimal(15), calculated);
    }
    @Test
    public void testCheesePizza(){
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);

        BigDecimal calculated = pizzaOrder.getCost();

        assertEquals(new BigDecimal(25), calculated);
    }
    @Test
    public void testComboPizza(){
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new ExtraColaDecorator(pizzaOrder);
        pizzaOrder = new ExtraOnionsDecorator(pizzaOrder);
        pizzaOrder = new ExtraPepperoniDecorator(pizzaOrder);
        pizzaOrder = new ExtraColaDecorator(pizzaOrder);
        pizzaOrder = new XLDecorator(pizzaOrder);

        BigDecimal calculated = pizzaOrder.getCost();
        String desciption = pizzaOrder.getDescription();

        assertEquals(new BigDecimal(35), calculated);
        assertEquals("You ordered Pizza!!! + extra cheese + extra cola can + extra onions + extra pepperoni" +
                " + extra cola can + double size", desciption);


    }
}
