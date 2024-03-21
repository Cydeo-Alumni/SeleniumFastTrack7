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

    @Test
    public void test2(){
        //1. Go	to https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");

        //2. Right click on A/B Testing link
        //3. Open link in new window
        actions.contextClick(actionsPage.abTestingLink)
                .sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.RETURN).perform();

        //4. Verify title is "No A/B Test"
        Assert.assertEquals(driver.getTitle(), "No A/B Test");
    }

    @Test
    public void test3(){

        //1. Go	to https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");

        //2. Scroll down to "Cydeo" link
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].scrollIntoView(true)", actionsPage.cydeoLink);

        BrowserUtils.sleep(3);

        js.executeScript("arguments[0].scrollIntoView(true)", actionsPage.homeLink);


    }
}
