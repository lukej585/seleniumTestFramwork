package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.*;
import utility.BaseTest;


public class Pages extends BaseTest{

   public Pages(){



    }

        public static Home CPMS_Home(){

            findElement(By.xpath("nihr-login")).click();

            return null;
        }

    
}
