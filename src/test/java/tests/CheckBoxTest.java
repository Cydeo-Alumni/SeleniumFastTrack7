package tests;

import org.testng.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;

public class CheckBoxTest {

    @Test
    public void checkBoxTest(){

        CheckBoxPage checkBoxPage = new CheckBoxPage();


        //1. Go to http://practice.cydeo.com/checkboxes
        Driver.getDriver().get("http://practice.cydeo.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        Assert.assertFalse(checkBoxPage.box1.isSelected());

        //3. Confirm checkbox #2 is SELECTED by default.
        Assert.assertTrue(checkBoxPage.box2.isSelected());

        //4. Click checkbox #1 to select it.
        checkBoxPage.box1.click();

        //5. Click checkbox #2 to deselect it.
        checkBoxPage.box2.click();

        //6. Confirm checkbox #1 is SELECTED.
        Assert.assertTrue(checkBoxPage.box1.isSelected());

        //7. Confirm checkbox #2 is NOT selected.
        Assert.assertFalse(checkBoxPage.box2.isSelected());
    }
}
