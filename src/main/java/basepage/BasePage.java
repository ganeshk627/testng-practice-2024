package basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import pageobjects.NavigationBarPage;
import pageobjects.ResetPasswordPage;

import java.time.Duration;

public class BasePage {

    protected  WebDriver driver; // inside the class outside the setupbrowser method
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected ResetPasswordPage resetPasswordPage;
    protected NavigationBarPage navigationBarPage;


    @BeforeMethod
    public void setupBrowser() {
        // 1. Open browser
        String browser = "chrome";

        switch(browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "msedge":
                driver = new EdgeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;

            default:
                driver = new EdgeDriver();
                break;
        }
        driver.manage().window().maximize();
        // Implicit time - global timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // 2. Open Orange application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Creating Objects to access page objects
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        resetPasswordPage = new ResetPasswordPage(driver);
        navigationBarPage = new NavigationBarPage();
    }

    @AfterMethod
    public void closeBrowser() {
        // 7. close the browser/ application even if the test failed/passed
        driver.quit();
    }

}
