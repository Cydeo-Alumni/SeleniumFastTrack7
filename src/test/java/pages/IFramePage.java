package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class IFramePage {

    public IFramePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //1. Go to website: http://practice.cydeo.com/iframe
    //2. Assert: "Your content goes here." Text is displayed.
    //3. Assert: "An iFrame containing the TinyMCE WYSIWYG Editor" Text is displayed.
    //4. switch back to default frame


    @FindBy(id = "mce_0_ifr")
    public WebElement iframe;

    @FindBy(xpath = "//p[.='Your content goes here.']")
    public WebElement text;

    @FindBy(xpath = "//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']")
    public WebElement title;
}
