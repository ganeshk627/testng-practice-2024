package tests.smoke;

import basepage.BaseTest;
import org.testng.annotations.Test;

public class ResetPasswordTest extends BaseTest {

    @Test
    public void resetPasswordTest() {
        String username = "harry@gmail.com";
        loginPage.clickForgotPassword();
        resetPasswordPage.typeResetUsername(username);
        resetPasswordPage.clickResetPasswordButton();
        resetPasswordPage.validateResetPassword();

    }
}
