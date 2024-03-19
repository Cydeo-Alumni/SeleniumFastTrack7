package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;

public class Locators {

    /*
    we have 8 types of locators
    1. id
    2. name
    3. className
    4. tagName
    5. linkText
    6. partialLinkText

    custom locators
    7. css
    8. xpath
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // 1. id
        WebElement byId = driver.findElement(By.id("content"));

        // 2. name
        WebElement byName = driver.findElement(By.name("viewport"));

        // 3. className
        WebElement byClassName = driver.findElement(By.className("list-group"));

        // 4. tagName
        WebElement byTagName = driver.findElement(By.tagName("li"));

        // 5. linkText
        WebElement byLinkText = driver.findElement(By.linkText("Typos"));

        // 6. partialLinkText
        WebElement byPartialLinkText = driver.findElement(By.partialLinkText("Mailing"));


        // css locators
        // first syntax    tagName[attributeName='attributeValue']
        WebElement byCss1 = driver.findElement(By.cssSelector("div[id='page-footer']"));

        // second syntax   . for class,  # for id
        WebElement byCss2 = driver.findElement(By.cssSelector("div.row"));

        // going from parent to child, use > sign
        // li.list-group-item > a
        // in css, we can not go from child to parent


        // 8. xpath
        // 1) absolute xpath    /html/body/div/div/div
        // 2) relative xpath    //div[@id='flash-messages']
        /*
        xpath methods
        //div[contains(@class,'columns')]
        //div[starts-with(@class,'large')]
        //a[text()='Dropdown']     or    //a[.='Dropdown']

         */

        //      //*[@*='*']    first * means any tags,  second * means any attribute, third * means value = "*"

        /*
        parent from child    //div[@id='content']/style
        child from parent    //div[@id='content']/style/..
        //nav[@class='navbar navbar-expand-sm bg-light']/following-sibling::div
        //div[@class='container']/preceding-sibling::nav
        follwing and preceding method is locating all the elements next or previous to it
         */





    }
}
