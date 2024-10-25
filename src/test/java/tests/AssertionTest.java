package tests;

import basepage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import utils.MyUtils;

import java.time.Duration;

public class AssertionTest extends BasePage {
    @DataProvider(parallel = true)
    public Object[][] logindata() {
        Object[][] data =
                {

                        {"Admin", "admin123"},
                        {"Admin", "admin@123"}, // invalid
                        {"harry", "harry@123"}, // invalid
                        {"ronny", "iamron@123"}, // invalid

                };
        return data;
    }


    @Test(dataProvider = "logindata")
    public void loginTest(String username, String password) {

//        // 1. Open browser
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        // Implicit time - global timeout
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        // 2. Open Orange application
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//        // Creating Objects to access page objects
//        LoginPage loginPage = new LoginPage(driver);
//        DashboardPage dashboardPage = new DashboardPage(driver);

        // 3. Enter username as "admin"
        loginPage.enterUsername(username);

        // 4. Enter password as "admin@123"
        loginPage.enterPassword(password);

        // 5. Click the login button
        loginPage.clickLogin();

        // 6. Verify dashboard url
        dashboardPage.validateDashboard();

//        // 7. close the browser/ application
//        driver.quit();
    }



}
