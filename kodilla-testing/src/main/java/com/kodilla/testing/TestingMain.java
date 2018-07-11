package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain
{
    public static void main(String[]args)
    {
       SimpleUser simpleUser = new SimpleUser("theForumUser");
       String result = simpleUser.getUsername();

       if(result.equals("theForumUser"))
       {
           System.out.println(" Test OK");
       }
       else
       {
           System.out.println("Error!!!");
       }
        System.out.println("Test pierwszy - test jednostkowy");

        Calculator calculator = new Calculator(5, 4);
        int addingResult = calculator.add();
        int subtractingResult = calculator.subtract();

        if(addingResult == 9)
        {
            System.out.println("Test is OK");
        }
        else
        {
            System.out.println("Error");
        }
        if(subtractingResult == 1)
        {
            System.out.println("Test is OK");
        }
        else
        {
            System.out.println("Error");
        }


    }
}
