import Pages.HomePage;
import Pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomeTest {
    private WebDriver driver;
    private HomePage assertHome;

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
    public void addtochartsaucademo(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.saucademologin("standard_user","secret_sauce");
        homePage.implicitywait(); //IMPLEMENTASI Implicit waits
        homePage.validasidinamisbyid(By.id("inventory_container"));//IMPLEMENTASI ASSERT
        homePage.cardbutton();

    }
    @Test
    public void removetochartsaucademo(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.saucademologin("standard_user","secret_sauce");
        homePage.cardbutton();
        homePage.removecard();
    }
    @Test
    public void hamburgerbutton(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.saucademologin("standard_user","secret_sauce");
        homePage.hamburger();
    }
    @Test
    public void filterZtoA(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.saucademologin("standard_user","secret_sauce");
        homePage.filter();
        homePage.ZtoA();
    }
    @Test
    public void filterlowtohigh(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.saucademologin("standard_user","secret_sauce");
        homePage.filter();
        homePage.lowtohigh();
        homePage.menemukanfilterlowtohigh();
    }
    @Test
    public void filterhightolowh(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.saucademologin("standard_user","secret_sauce");
        homePage.filter();
        homePage.hightolow();//MEMVALIDASI LOW TO HIGH
    }
    @Test
    public void seecart(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.saucademologin("standard_user","secret_sauce");
        homePage.iconcart();
    }

    @After
    public void treardown(){
    driver.quit();
    }

}
