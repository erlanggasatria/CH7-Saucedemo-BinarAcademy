package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {
    WebDriver driver;

    public OverviewPage(WebDriver driver){
        this.driver=driver;
    }
    By titleOverview = By.xpath("/html/body/div/div/div/div[1]/div[2]/span");
    By finsihclick = By.id("finish");
    By cencleclickOV = By.id("cancel");

    public void titleoverviewcek(){
        driver.findElement(titleOverview);
    }
    public void finishbutton(){
        driver.findElement(finsihclick).click();
    }
    public void cenclickbutton(){
        driver.findElement(cencleclickOV).click();
    }
}
