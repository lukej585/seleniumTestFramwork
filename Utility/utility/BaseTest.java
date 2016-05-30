package utility;

import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.GlobalNavigation;
import pages.Home;


public class BaseTest{

    public static WebDriver driver;

    public BaseTest(){

    }


    @BeforeClass
    public static void setup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://test.cpms.crncc.nihr.ac.uk/");

        Home.login();

        //driver.findElement(By.xpath("//a[@id='nihr-login']")).click();

    }



//    public static WebDriver getDriver(){
//        return driver;
//    }


    //TODO: implement find that uses the driver

    public static WebElement findElement(By by){

        WebElement element = driver.findElement(by);

        return element;
    }



}
