package pages;

import org.openqa.selenium.support.*;
import utilities.*;

public class ActionsPage {

    public ActionsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //TC#1
    //1. Go to http://practice.cydeo.com/hovers
    //2. Hover over to first image
    //3. Assert: “name: user1” is displayed
    //4. Hover over to second image
    //5. Assert: “name: user2” is displayed
    //6. Hover over to third image
    //7. Assert: “name: user3” is displayed


    //TC#2
    //1. Go	to https://practice.cydeo.com/
    //2. Right click on A/B Testing link
    //3. Open link in new window
    //4. Verify title is "No A/B Test"

    //TC#3
    //1. Go	to https://practice.cydeo.com/
    //2. Scroll down to "Cydeo" link
    //3. Scroll up to "Home" link
}
