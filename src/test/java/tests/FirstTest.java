package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class FirstTest {

    public static void main(String[] args) {

        // set up driver object
        WebDriver driver = new ChromeDriver();

        // go to webpage
        driver.get("https://www.google.com");
        //driver.navigate().to("url");




    }
}
