package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String SELECT_DAY = "//div[contains(@class, \"5k_5\")]/span/span/select[1]";
    public static final String SELECT_MONTH = "//div[contains(@class, \"5k_5\")]/span/span/select[2]";
    public static final String SELECT_YEAR = "//div[contains(@class, \"5k_5\")]/span/span/select[3]";
    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo = driver.findElement(By.xpath(SELECT_DAY));
        Select selectDay = new Select(selectCombo);

        WebElement selectCombo1 = driver.findElement(By.xpath(SELECT_MONTH));
        Select selectMonth = new Select(selectCombo1);

        WebElement selectCombo2 = driver.findElement(By.xpath(SELECT_YEAR));
        Select selectYear = new Select(selectCombo2);


        selectDay.selectByIndex(15);
        selectMonth.selectByIndex(6);
        selectYear.selectByIndex(31);

    }
}
