package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;
import org.testng.annotations.*;
import pages.*;
import utilities.*;

import java.util.*;

public class DropDownTest {

    DropDownPage dropDownPage = new DropDownPage();

    @BeforeMethod
    public void goToPage() {
        Driver.getDriver().get("http://practice.cydeo.com/dropdown");

    }

    @Test
    public void test1() {

        //1. Go to http://practice.cydeo.com/dropdown
        //Driver.getDriver().get("http://practice.cydeo.com/dropdown");

        //2. Select Illinois --> select by visible text
        Select selectState = new Select(dropDownPage.stateDropDown);
        selectState.selectByVisibleText("Illinois");

        //3. Select Virginia --> select by value
        selectState.selectByValue("VA");

        //4. Select California --> select by index
        selectState.selectByIndex(5);

        //5. Verify final selected option is California.
        //Assert.assertTrue(selectState.getFirstSelectedOption());
        String acutalOption = selectState.getFirstSelectedOption().getText();  // california
        String expectedOption = "California";
        Assert.assertEquals(acutalOption, expectedOption);
    }

    @Test
    public void test3() {


        //1.Go to http://practice.cydeo.com/dropdown
        //Driver.getDriver().get("http://practice.cydeo.com/dropdown");

        //2. Select all the options from multiple language select dropdown.
        //3. Print out all selected values and verify each is selected.

        Select languageSelect = new Select(dropDownPage.languagesDropDown);
        List<WebElement> options = languageSelect.getOptions();

        for (WebElement option : options) {
            languageSelect.selectByVisibleText(option.getText());
            System.out.println(option.getText());
            Assert.assertTrue(option.isSelected());
        }

        //4. Deselect all values and verify each is deselected.
        languageSelect.deselectAll();

        for (WebElement option : options) {
            Assert.assertFalse(option.isSelected());
        }

    }
}
