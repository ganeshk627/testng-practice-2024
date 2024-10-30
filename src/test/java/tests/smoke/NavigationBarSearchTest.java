package tests.smoke;

import basepage.BaseTest;
import org.testng.annotations.Test;

public class NavigationBarSearchTest extends BaseTest {
    String username = "admin";
    String password = "admin123";


    @Test
    public void searchTimeTest() {
        String sectionName = "time";
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        dashboardPage.validateDashboard();
        navigationBarPage.searchSection(sectionName);
        // validate section in search results

    }

    @Test
    public void searchRecruitmentTest() {
        String sectionName = "recruitment";
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        dashboardPage.validateDashboard();
        navigationBarPage.searchSection(sectionName);
        // validate section in search results

    }

    @Test
    public void searchLeaveTest() {
        String sectionName = "leave";
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        dashboardPage.validateDashboard();
        navigationBarPage.searchSection(sectionName);
        // validate section in search results

    }
}
