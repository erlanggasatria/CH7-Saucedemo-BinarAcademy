import Pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CartTest {

    private WebDriver driver;

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
    public void addtwoproduct(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.saucademologin("standard_user","secret_sauce");
        homePage.cardbutton();
        homePage.cardbutton2();
        homePage.iconcart();
    }
    @Test
    public void removeformcart(){
        HomePage homePage = new HomePage(driver);
        addtwoproduct();
        homePage.removecard();
        homePage.removeacrd2();
    }
    @Test
    public void checkoutsampaiselesai(){
        cartPage cartpage = new cartPage(driver);
        HomePage homePage = new HomePage(driver);
        OverviewPage overviewpage = new OverviewPage(driver);
        yourInformationPage yourinfomation = new yourInformationPage(driver);
        addtwoproduct();
        cartpage.Checkout();
        yourinfomation.inputyourinformation("erlangga", "satria","12342uuy");
        yourinfomation.continuebutton();
        overviewpage.finishbutton();
        homePage.validasidinamisbyid(By.id("checkout_complete_container"));//VALIDASI TRANSAKSI SUKSES
    }

    @After
    public void treardown(){
    driver.quit();
    }
}
