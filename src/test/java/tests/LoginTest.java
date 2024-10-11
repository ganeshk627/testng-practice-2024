package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.LoginPage;

import java.time.Duration;

public class LoginTest {

    @Test
    public void validLoginTest() {
        String username = "admin";
        String password = "admin123";

        // 1. Open browser
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Implicit time - global timeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // 2. Open Orange application
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        LoginPage loginPage = new LoginPage(driver);

        // 3. Enter username as "admin"
        loginPage.enterUsername(username);

        // 4. Enter password as "admin123"
        loginPage.enterPassword(password);

        // 5. Click the login button
        loginPage.clickLogin();

        System.out.println(driver.getCurrentUrl());


        // 7. close the browser/ application
        driver.quit();
    }


    @Test
    public void invalidLoginTest() {
        String username = "admin";
        String password = "admin@123";

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
