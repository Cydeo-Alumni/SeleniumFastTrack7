package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Methods {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
        findElement()
         - returning 1 web element
         - when element is not found, it gives no such element exception


        findElements()
         - returning list of web elements
         - empty list
         */
    }
}
