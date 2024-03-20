package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.page.*;
import org.openqa.selenium.devtools.v85.webaudio.model.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class DropDownPage {

    public DropDownPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //TC#1
    //1. Go to http://practice.cydeo.com/dropdown
    //2. Select Illinois --> select by visible text
    //3. Select Virginia --> select by value
    //4. Select California --> select by index

    //TC#2
    //Select “December 1st, 1950g” and verify it is selected.
    //1. Go to http://practice.cydeo.com/dropdown
    //2. Select Year --> by visible text
    //3. Select Month -->  by value
    //4. Select Day -->  by index

    //TC#3
    //1.Go to http://practice.cydeo.com/dropdown
    //2. Select all the options from multiple language select dropdown.
    //3. Print out all selected values and verify each is selected.
    //4. Deselect all values and verify each is deselected.


    @FindBy(id = "state")
    public WebElement stateDropDown;

    @FindBy(name = "Languages")
    public WebElement languagesDropDown;

}
