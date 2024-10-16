package tests.attributes;

import datas.LoginData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.LoginPage;

import java.time.Duration;


public class DataProviderFromAnotherClassTest {

    @Test(dataProvider = "logindata", dataProviderClass = LoginData.class)
    public void loginTest(String username, String password) {
//        String username = "admin";
//        String password = "admin123";

        // 1. Open browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Implicit time - global timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // 2. Open Orange application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Creating Objects to access page objects
        LoginPage loginPage = new LoginPage(driver);

        // 3. Enter username as "admin"
        loginPage.enterUsername(username);

        // 4. Enter password as "admin@123"
        loginPage.enterPassword(password);

        // 5. Click the login button
        loginPage.clickLogin();


        // 6. Verify dashboard url
        System.out.println(driver.getCurrentUrl());

        // 7. close the browser/ application
        driver.quit();
    }


}
