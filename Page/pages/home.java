package pages;
import org.openqa.selenium.*;
import utility.BaseTest;


public class home extends pages {

    WebDriver driver;

    public home(WebDriver driver){
        this.driver = driver;
    }

    public  void login(){



        driver.get("https://test.cpms.crncc.nihr.ac.uk/");
        findElement(By.xpath("nihr-login")).click();
    }
}
