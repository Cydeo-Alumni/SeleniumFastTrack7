package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.*;
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
        actions.moveToElement(actionsPage.image1).perform();

        //3. Assert: “name: user1” is displayed
        Assert.assertTrue(actionsPage.name1.isDisplayed());

        //4. Hover over to second image
        actions.moveToElement(actionsPage.image2).perform();

        //5. Assert: “name: user2” is displayed
        Assert.assertTrue(actionsPage.name2.isDisplayed());

        //6. Hover over to third image
        actions.moveToElement(actionsPage.image3).perform();

        //7. Assert: “name: user3” is displayed
        Assert.assertTrue(actionsPage.name3.isDisplayed());


    }
}
