package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;

public class ActionsTest {

    ActionsPage actionsPage = new ActionsPage();
    WebDriver driver = Driver.getDriver();

    Actions actions = new Actions(driver);

    @Test
    public void test1(){
        //1. Go to http://practice.cydeo.com/hovers
        driver.get("http://practice.cydeo.com/hovers");

        //2. Hover over to first image

    }
}
