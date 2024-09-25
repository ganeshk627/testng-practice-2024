package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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



}
