package pages;

import org.openqa.selenium.support.*;
import utilities.*;

public class CheckBoxPage {

    public CheckBoxPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //TC #1:checkboxes
    //1. Go to http://practice.cydeo.com/checkboxes
    //2. Confirm checkbox #1 is NOT selected by default
    //3. Confirm checkbox #2 is SELECTED by default.
    //4. Click checkbox #1 to select it.
    //5. Click checkbox #2 to deselect it.
    //6. Confirm checkbox #1 is SELECTED.
    //7. Confirm checkbox #2 is NOT selected.
}
