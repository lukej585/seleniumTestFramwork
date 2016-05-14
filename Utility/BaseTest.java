import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Luke on 14/05/2016.
 */
public abstract class BaseTest implements org.junit.BeforeClass{

    public static WebDriver driver;

    public BaseTest(){
        System.out.println(getClass().toString() + " invoked");
    }

    @BeforeClass
    public static void setup(){

        driver = new FirefoxDriver();

    }

    public static WebDriver getDriver(){
        return driver;
    }


    //TODO: implement find that uses the driver
    public WebElement findElement(By by){

        //WebElement element =

        return null;
    }



}
