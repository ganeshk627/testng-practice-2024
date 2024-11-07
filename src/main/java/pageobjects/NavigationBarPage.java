package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MyUtils;

public class NavigationBarPage {

    WebDriver ldriver;
    MyUtils utils = new MyUtils();

    private By SEARCH_INPUT = By.xpath("//input[@placeholder='Search']");

    public NavigationBarPage(WebDriver rdriver) {
        ldriver = rdriver;
    }

    public void searchSection(String sectionName) {
        utils.waitFor(2);
        ldriver.findElement(SEARCH_INPUT).sendKeys(sectionName);
        utils.waitFor(5);
    }
}
