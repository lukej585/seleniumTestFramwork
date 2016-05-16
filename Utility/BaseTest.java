import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Luke on 14/05/2016.
 */
public abstract class BaseTest{

    public static WebDriver driver;

    public BaseTest(){
        ;setup();
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
