package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Luke on 19/05/2016.
 */
public class Browser extends BaseTest {

    public WebDriver selectBrowser(String browser){

        switch(browser) {

            case "firefox" : return new FirefoxDriver();

            case "chrome" : return new ChromeDriver();

            default: return new FirefoxDriver();


        }


    }

    public WebDriver getDriver (){
        return driver;
    }
}
