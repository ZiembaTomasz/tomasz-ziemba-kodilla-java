package com.kodilla.testing2.config;

import org.openqa.selenium.WebDriver;

public class Browser {
    static WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
    public static void goTo(String url){
        driver.get(url);
    }
    public static String title(){
        return driver.getTitle();
    }
    public static void close(){
        driver.close();
    }
}
