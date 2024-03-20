package tests;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;

public class AlertTest {

    AlertsPage alertsPage = new AlertsPage();

    @Test
    public void test1(){

        //1. Go to website: http://practice.cydeo.com/javascript_alerts
        Driver.getDriver().get("http://practice.cydeo.com/javascript_alerts");

        //2. Click for JS Prompt button for alert to be displayed
        alertsPage.promptAlert.click();

        //3. Write "hello" in input text
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.sendKeys("hello");

        //4. Click OK button from the alert
        alert.accept();

        //5. Verify "You entered: hello" text is displayed in result
        String actualResult = alertsPage.resultText.getText();
        String expectedResult = "You entered: hello";
        Assert.assertEquals(actualResult,expectedResult);

    }
}
