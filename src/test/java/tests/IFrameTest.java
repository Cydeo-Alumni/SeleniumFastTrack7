package tests;

import org.testng.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;

public class IFrameTest {

    IFramePage iFramePage = new IFramePage();

    @Test
    public void test1(){
        //1. Go to website: http://practice.cydeo.com/iframe
        Driver.getDriver().get("http://practice.cydeo.com/iframe");

        //2. Assert: "Your content goes here." Text is displayed.
        Driver.getDriver().switchTo().frame(iFramePage.iframe);
        Assert.assertTrue(iFramePage.text.isDisplayed());

        //3. Assert: "An iFrame containing the TinyMCE WYSIWYG Editor" Text is displayed.
        Driver.getDriver().switchTo().parentFrame();
        Assert.assertTrue(iFramePage.title.isDisplayed());

        //4. switch back to default frame
        Driver.getDriver().switchTo().defaultContent();

    }
}
