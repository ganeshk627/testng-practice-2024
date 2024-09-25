package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    // 1. Variables for Locators and driver
    WebDriver driver;

    By USERNAME = By.name("username");
    By PASSWORD = By.cssSelector("input[placeholder='Password']");
    By LOGIN_BUTTON = By.tagName("button");
    By FORGOT_PASSORD = By.xpath("//p[normalize-space()='Forgot your password?']");


    // 3. Constructor for initializing the driver
    public LoginPage(WebDriver rdriver) {
        driver = rdriver;
    }

    // 2. Methods for doing actions
    public void enterUsername(String username) {
//        WebElement inputUsername = driver.findElement(By.name("username"));
        WebElement inputUsername = driver.findElement(USERNAME);
        inputUsername.click();
        inputUsername.sendKeys(username);
    }

    public void enterInvalidUsername(String username) {
        WebElement inputUsername = driver.findElement(USERNAME);
        inputUsername.click();
        inputUsername.sendKeys(username);
    }

    public void enterPassword(String password) {
//        WebElement inputPassword = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        WebElement inputPassword = driver.findElement(PASSWORD);
        inputPassword.click();
        inputPassword.sendKeys(password);
    }

    public void clickLogin() {
//        WebElement loginButton = driver.findElement(By.tagName("button"));
        WebElement loginButton = driver.findElement(LOGIN_BUTTON);
        loginButton.click();
    }

    public void clickForgotPassword(){
        driver.findElement(FORGOT_PASSORD).click();
    }

}
