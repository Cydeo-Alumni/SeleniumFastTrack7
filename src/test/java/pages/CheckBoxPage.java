package pages;

import org.openqa.selenium.support.*;
import utilities.*;

public class CheckBoxPage {

    public CheckBoxPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
