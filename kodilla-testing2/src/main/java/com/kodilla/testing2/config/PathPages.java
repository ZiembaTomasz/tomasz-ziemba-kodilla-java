package com.kodilla.testing2.config;

import org.openqa.selenium.By;

public class PathPages {
    static String url = "https://app.pluralsight.com/paths/skills/java";
    static String title = "Pluralsight";
    public void goTo(){
        Browser.goTo(url);
    }
    public void goToJavaPath(){
        Browser.driver.findElement(By.xpath());

    }
}
