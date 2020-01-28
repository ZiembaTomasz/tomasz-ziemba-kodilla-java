package com.kodilla.testing2.config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ButtonsTest {
    public static void main(String[]args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("http://localhost:63342/kodilla-course/kodilla-testing2/RadioButtonTest.html?_ijt=o5280lgl9rmsmmncrflla5hm72");
        List<WebElement> radioButtons = driver.findElements(By.name("color"));
        radioButtons.get(1).click();
        for(WebElement radioButton : radioButtons){
            if(radioButton.isSelected()){
                System.out.println(radioButton.getAttribute("value"));
            }
        }
    }
}
