package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage {
    WebDriver driver;

    public cartPage (WebDriver driver){
        this.driver=driver;
    }

    By continueshoping = By.id("continue-shopping");
    By Checkoutklik = By.id("checkout");

    public void lanjutshoping(){
        driver.findElement(continueshoping).click();
    }
    public void Checkout(){
        driver.findElement(Checkoutklik).click();
    }
}
