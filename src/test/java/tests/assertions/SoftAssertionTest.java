package tests.assertions;

import basepage.BaseTest;
import org.testng.annotations.Test;

public class SoftAssertionTest extends BaseTest {
    String username = "admin";
    String password = "admin@123"; //wrong password

    @Test
    public void softAssertTest() {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        dashboardPage.validateDashboardWithSoftAssert();
    }


}
