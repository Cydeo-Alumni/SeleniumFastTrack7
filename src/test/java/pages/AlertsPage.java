package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class AlertsPage {

    public AlertsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //1. Go to website: http://practice.cydeo.com/javascript_alerts
    //2. Click for JS Prompt button for alert to be displayed
    //3. Write "hello" in input text
    //3. Click OK button from the alert
    //4. Verify "You entered: hello" text is displayed in result

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    public WebElement promptAlert;

    @FindBy(id = "result")
    public WebElement resultText;


}
