package utility;

import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Luke on 14/05/2016.
 */
public class BaseTest{

    public static WebDriver driver;

    public BaseTest(){
        //driver = new FirefoxDriver();
        //setup1();
    }


    public static void setup1(){

        driver = new FirefoxDriver();

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
