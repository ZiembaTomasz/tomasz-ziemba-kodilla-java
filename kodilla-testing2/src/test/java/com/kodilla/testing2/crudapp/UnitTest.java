package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.Browser;
import com.kodilla.testing2.config.HomePage;
import com.kodilla.testing2.config.Pages;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {
    @Test
    public void canGoToHomePage(){
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());
    }
    @Test
    public void canGoToJavaPath(){
        Pages.pathPages().goTo();
        Assert.assertThat(Pages.pathPages().isAt());
    }
    @After
    public void cleanUp(){
        Browser.close();
    }
}
