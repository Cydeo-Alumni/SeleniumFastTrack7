package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class RadioButtonPage {


    public RadioButtonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "sdfds")
    public WebElement button2;
}
