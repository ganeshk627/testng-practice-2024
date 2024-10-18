package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPasswordPage {
    WebDriver ldriver;
    By RESET_PASSWORD = By.xpath("//button[normalize-space()='Reset Password']");//Locator
    By USERNAME = By.cssSelector("input[placeholder='Username']");
    By CANCEL_BUTTON = By.xpath("//button[normalize-space()='Cancel']");

    public ResetPasswordPage(WebDriver rdriver) {
        ldriver = rdriver;//Constructor
    }

    public void typeResetUsername(String username) {
        ldriver.findElement(USERNAME).sendKeys(username);
    }

    public void clickResetPasswordButton() {
        ldriver.findElement(RESET_PASSWORD).click();
        // ldriver.findElement(CANCEL_BUTTON);
    }

    public void clickCancelButton() {
        WebElement cancelButton = ldriver.findElement(CANCEL_BUTTON);
        cancelButton.click();
    }
}
