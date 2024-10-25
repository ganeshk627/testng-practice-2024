package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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

    public void validateResetPassword() {
        String reset_url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";
        String expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/sendPasswordReset";
        String actual_url = ldriver.getCurrentUrl();
        Assert.assertEquals(actual_url, expected_url);
        Assert.assertNotEquals(actual_url, reset_url);

    }
}
