import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.Home;
import pages.Home;
import pages.Pages;
import utility.BaseTest;
import org.junit.BeforeClass;
//import static pages.home.login;
import static pages.Home.*;


public class Sample extends BaseTest {

   public static WebDriver driver;
    static Home home;



    @BeforeClass
    public static void setup(){
        driver = new FirefoxDriver();
        //driver.get("https://test.cpms.crncc.nihr.ac.uk/");
    }

    @Test
    public void test1(){
        home = new Home(driver);
        home.login();

    }





}