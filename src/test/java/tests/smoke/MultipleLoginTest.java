package tests.smoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;

import java.time.Duration;

public class MultipleLoginTest {


    @DataProvider
    public Object[][] logindata() {
        Object[][] data =
                {
                        {"admin", "admin123"},
                        {"ADMIN", "admin123"},
                        {"Admin", "admin123"},
                        {"harry", "harry@123"},
                };
        return data;
    }

    WebDriver driver; // inside the class outside the setupbrowser method
    LoginPage loginPage;
    DashboardPage dashboardPage;

    @BeforeMethod
    public void setupBrowser() {
        // 1. Open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Implicit time - global timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // 2. Open Orange application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Creating Objects to access page objects
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
    }

    @AfterMethod
    public void closeBrowser() {
        // 7. close the browser/ application even if the test failed/passed
        driver.quit();
    }


    @Test(dataProvider = "logindata")
    public void loginTest(String username, String password) {
//        String username = "admin";
//        String password = "admin123";

//        // 1. Open browser
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        // Implicit time - global timeout
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
