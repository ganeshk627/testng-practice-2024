package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardPage {
    //1. locators and driver
    WebDriver ldriver;

    By SEARCH = By.xpath("//input[@placeholder='Search']");

    // 2. constructor
    public DashboardPage(WebDriver rdriver) {
        ldriver = rdriver;
    }

    // 3. methods
    public void search(String query) {
        ldriver.findElement(SEARCH).click();
        ldriver.findElement(SEARCH).sendKeys(query);
    }

    public void validateDashboard() {
        // System.out.println(driver.getCurrentUrl());
        //expected
        String login_url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        String expected_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        //actual
        String actual_url = ldriver.getCurrentUrl();
        Assert.assertEquals(actual_url, expected_url); //hard assert
        Assert.assertNotEquals(actual_url, login_url); // hard assert
    }



}
