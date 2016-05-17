package pages;
import org.openqa.selenium.*;
import utility.BaseTest;


public class Home extends Pages {

    WebDriver driver;

    public Home(WebDriver driver){
        this.driver = driver;
    }

    public void login(){



        driver.get("https://test.cpms.crncc.nihr.ac.uk/");

        //TODO: fix
        findElement(By.xpath("nihr-login")).click();
    }
}
