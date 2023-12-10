package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){

        this.driver=driver;
    }

    By usernameInput = By.id("user-name");
    By passwordInput = By.id("password");
    By btnloginClick = By.id("login-button");
    By errormassageshowlgn = By.className("error-message-container");

    public void enterusername(String username){
        driver.findElement(usernameInput).sendKeys(username);
    }
    public void enterpassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }
    public void loginclick(){
        driver.findElement(btnloginClick).click();
    }
    public void errormassagelgn(){
        driver.findElement(errormassageshowlgn);
    }

    public LoginPage saucademologin(String username, String password){
        enterusername(username);
        enterpassword(password);
        loginclick();
        return this;
    }
}



