package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {

        // set up driver object
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // go to webpage
        driver.get("https://www.google.com");
        //driver.navigate().to("url");

        Thread.sleep(2000);
        driver.get("https://www.amazon.com");

        // navigate back
        Thread.sleep(2000);
        driver.navigate().back();

        // navigate forward
        Thread.sleep(2000);
        driver.navigate().forward();

        // refresh
        Thread.sleep(2000);
        driver.navigate().refresh();

        // get title
        System.out.println("driver.getTitle() = " + driver.getTitle());

        // get current url
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

    }
}
