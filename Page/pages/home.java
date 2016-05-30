package pages;
import org.openqa.selenium.*;
import utility.BaseTest;
import utility.Constants;


public class Home extends Pages {



    public Home(WebDriver driver){
        this.driver = driver;
    }

    public static void login(){

        //driver.findElement(By.xpath("//a[@id='nihr-login']")).click();

        findElement(By.xpath("//a[@id='nihr-login']")).click();

        findElement(By.xpath("//input[@type='email']")).click();
        findElement(By.xpath("//input[@type='email']")).sendKeys(Constants.SystemUsername);
        findElement(By.xpath("//input[@type='password']")).click();
        findElement(By.xpath("//input[@type='password']")).sendKeys(Constants.SystemPassword);

        findElement(By.xpath("//a[text()='Login']")).click();



        //TODO: fix
        //findElement(By.xpath("nihr-login")).click();
    }
}
