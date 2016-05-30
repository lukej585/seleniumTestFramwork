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



    @Test
    public void test1(){
        home = new Home(driver);
        System.out.println("hello");

    }





}