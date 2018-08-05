package com.kodilla.good.patterns.task;

public class Processing {

    public static void main(String [] args){
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.process("Extra Food Shop", 30, "bags of flour");
        HealthyShop healthyShop = new HealthyShop();
        healthyShop.process("Healthy Shop", 50, "salmons" );
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        glutenFreeShop.process("Gluten Free Shop", 30, " bags of rice for sell!!!");
        AddingClass addingClass = new AddingClass();
        addingClass.process("Sport shop", 50, "protein bars");
    }
}
