package tests;

import org.testng.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;

import java.util.*;

public class WindowHandleTest {

    WindowHandlePage windowHandlePage = new WindowHandlePage();

    @Test
    public void test1() {

        //1. Go to website: http://practice.cydeo.com/windows
        Driver.getDriver().get("http://practice.cydeo.com/windows");
        String mainHandle = Driver.getDriver().getWindowHandle();
        BrowserUtils.sleep(2);


        //2. Assert: Title is “Windows”
        Assert.assertEquals(Driver.getDriver().getTitle(), "Windows");

        //3. Click to: “Click Here” link
        windowHandlePage.clickLink.click();

        //4. Click to: “Cydeo” link
        windowHandlePage.cydeoLink.click();

        //5. Switch to Cydeo page
        Set<String> handles = Driver.getDriver().getWindowHandles();
        for (String handel : handles) {
            Driver.getDriver().switchTo().window(handel);
            if(Driver.getDriver().getTitle() == "Cydeo"){
                break;
            }
        }

        //6. Assert: Title is “Cydeo”
        Assert.assertEquals(Driver.getDriver().getTitle(), "Cydeo");

        //7.Switch back to main handle
        Driver.getDriver().switchTo().window(mainHandle);
        Assert.assertEquals(Driver.getDriver().getTitle(), "Windows");




    }
}
