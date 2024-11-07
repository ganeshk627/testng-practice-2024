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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {

    protected  WebDriver driver; // inside the class outside the setupbrowser method
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected ResetPasswordPage resetPasswordPage;
    protected NavigationBarPage navigationBarPage;



    @BeforeMethod
    public void setupBrowser() throws IOException {
        // 1. Open browser
//        String browser = "msedge";
        FileInputStream fis = new FileInputStream("src/test/resources/browser.properties");
        Properties properties = new Properties();
        properties.load(fis);
//        String browser = properties.getProperty("browser");
//        switch(browser.toLowerCase()) {
            switch(properties.getProperty("browser").toLowerCase()) {
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
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(properties.getProperty("implicitwait"))));

        // 2. Open Orange application
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.get(properties.getProperty("url"));

        // Creating Objects to access page objects
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        resetPasswordPage = new ResetPasswordPage(driver);
        navigationBarPage = new NavigationBarPage(driver);
    }

    @AfterMethod
    public void closeBrowser() {
        // 7. close the browser/ application even if the test failed/passed
        driver.quit();
    }

}
