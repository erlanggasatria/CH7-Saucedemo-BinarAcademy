package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class yourInformationPage {
    WebDriver driver;

    public yourInformationPage(WebDriver driver){
        this.driver=driver;
    }

    By firtnameinput = By.id("first-name");
    By lastnameinput = By.id("last-name");
    By postalcodeinput = By.id("postal-code");
    By continueclick = By.id("continue");
    By cencleclic = By.id("cancel");

    public void inputyourinformation(String firstname, String lastname, String postalcode){
        driver.findElement(firtnameinput).sendKeys(firstname);
        driver.findElement(lastnameinput).sendKeys(firstname);
        driver.findElement(postalcodeinput).sendKeys(postalcode);
    }

    public void continuebutton(){
        driver.findElement(continueclick).click();
    }

    public void cenclecutton(){
        driver.findElement(continueclick).click();
    }
}


