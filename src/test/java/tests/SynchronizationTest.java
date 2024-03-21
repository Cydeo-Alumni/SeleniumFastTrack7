package tests;

import org.openqa.selenium.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;

public class SynchronizationTest {

    SynchronizationPage synPage = new SynchronizationPage();

    WebDriver driver = Driver.getDriver();

    @Test
    public void test1(){
        //1. Go to http://practice.cydeo.com/dynamic_loading/1
        driver.get("http://practice.cydeo.com/dynamic_loading/1");

        //2. Click to start
        synPage.startButton.click();

        //3. Wait until loading bar disappears



    }
}
