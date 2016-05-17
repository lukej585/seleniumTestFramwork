import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.home;
import utility.BaseTest;
import org.junit.BeforeClass;
//import static pages.home.login;
import static pages.home.*;


public class Sample extends BaseTest {

   public static WebDriver driver;
    static home home;



    @BeforeClass
    public static void setup(){
        driver = new FirefoxDriver();
        driver.get("https://test.cpms.crncc.nihr.ac.uk/");
    }

    @Test
    public void test1(){
        home = new home(driver);
    }





}