package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class WindowHandlePage {

    public WindowHandlePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //1. Go to website: http://practice.cydeo.com/windows
    //2. Assert: Title is “Windows”
    //3. Click to: “Click Here” link
    //4. Click to: “Cydeo” link
    //5. Switch to Cydeo page
    //6. Assert: Title is “Cydeo”
    //7.Switch back to main handle

    @FindBy(linkText = "Click Here")
    public WebElement clickLink;

    @FindBy(linkText = "CYDEO")
    public WebElement cydeoLink;

}
