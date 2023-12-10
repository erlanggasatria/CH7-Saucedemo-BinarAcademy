import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class LoginTest {
    private static WebDriver driver;

    @Before
    public void setup(){
        HomePage homePage = new HomePage(driver);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    public void validlogin(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.saucademologin("standard_user","secret_sauce");
        homePage.implicitywait(); //IMPLEMENTASI Implicit waits
        homePage.validasidinamisbyid(By.id("inventory_container"));//IMPLEMENTASI ASSERT
    }
    @Test
    public void invalidlogin(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.saucademologin("erlangga","satria");
        homePage.implicitywait(); //IMPLEMENTASI Implicit waits
        homePage.validateerrorlogin(); //IMPLEMENTASI ASSERT
    }

    @After
    public void treardown(){
    driver.quit();
    }

}
