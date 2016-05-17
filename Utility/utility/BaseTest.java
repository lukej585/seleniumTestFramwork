package utility;

import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseTest{

    public static WebDriver driver;

    public BaseTest(){

    }


    @BeforeClass
    public static void setup(){
        driver = new FirefoxDriver();
        driver.get("https://test.cpms.crncc.nihr.ac.uk/");
    }



    public static WebDriver getDriver(){
        return driver;
    }


    //TODO: implement find that uses the driver

    public static WebElement findElement(By by){

        WebElement element = driver.findElement(by);

        return element;
    }



}
