package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.xml.xpath.XPath;


public class GoogleTestingApp {
    public static final String SEARCHFIELD = "lst-ib";
    public static void main(String[]args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.com");
        String xp = "//html/body/div/div/div/div/div/div/div/div/div/div/div/a";

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("pluralsight");
        searchField.submit();
        WebElement searchField1 = driver.findElement(By.xpath(xp));
        searchField1.click();

    }
}
