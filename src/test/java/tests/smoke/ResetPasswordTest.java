package tests.smoke;

import basepage.BasePage;
import org.testng.annotations.Test;

public class ResetPasswordTest extends BasePage {

    @Test
    public void resetPasswordTest() {
        String username = "harry@gmail.com";
        loginPage.clickForgotPassword();
        resetPasswordPage.typeResetUsername(username);
        resetPasswordPage.clickResetPasswordButton();
        resetPasswordPage.validateResetPassword();

    }
}
