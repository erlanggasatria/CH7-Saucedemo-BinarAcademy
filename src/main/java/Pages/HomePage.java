package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;
public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    By iconcartshow = By.className("shopping_cart_link");
    By cardbuttonclick = By.id("add-to-cart-sauce-labs-backpack");
    By cardbuttonclick2 = By.id("add-to-cart-sauce-labs-bike-light");
    By filterclick = By.className("product_sort_container");
    By hamburgerbutton = By.id("react-burger-menu-btn");
    By removecardbutton = By.id("remove-sauce-labs-backpack");
    By removecardbutton2 = By.id("remove-sauce-labs-bike-light");
    By filterAtoZ = By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[1]");
    By filterZtoA = By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[2]");
    By filterLowtohigh = By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[3]");
    By filterhightolow = By.xpath("/html/body/div/div/div/div[1]/div[2]/div/span/select/option[4]");
    By validasifilterlowtohigh = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/div");

    public void iconcart(){
        driver.findElement(iconcartshow).click();
    }
    public void cardbutton(){
        driver.findElement(cardbuttonclick).click();
    }
    public void cardbutton2(){driver.findElement(cardbuttonclick2).click();}
    public void removecard(){
        driver.findElement(removecardbutton).click();
    }

    public void removeacrd2(){
        driver.findElement(removecardbutton2).click();
    }
    public void filter(){
        driver.findElement(filterclick).click();
    }
    public void AtoZ(){
        driver.findElement(filterAtoZ).click();
    }

    public void ZtoA(){
        driver.findElement(filterZtoA).click();
    }
    public void lowtohigh(){
        driver.findElement(filterLowtohigh).click();
    }
    public void hightolow(){
        driver.findElement(filterhightolow).click();
    }
    public void hamburger(){
        driver.findElement(hamburgerbutton).click();
    }
    public void menemukanfilterlowtohigh(){
        WebElement hargaProdukPertama = driver.findElement(validasifilterlowtohigh);
        String hargaProdukPertamaStr = hargaProdukPertama.getText();
        Assert.assertEquals(hargaProdukPertamaStr, "$7.99");
    }

    //IMPLEMENTASI Implicit waits
    public void implicitywait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    //IMPLEMENTASI Assert
   public void validasidinamisbyid(By idvalidsei){
        Assert.assertTrue(driver.findElement(idvalidsei).isDisplayed());
   }
   public void validateerrorlogin(){
        Assert.assertTrue(driver.findElement(By.className("error-message-container")).isDisplayed());
   }


}
