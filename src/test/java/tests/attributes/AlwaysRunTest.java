package tests.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CommonActions;


public class AlwaysRunTest {
CommonActions commonActions = new CommonActions();

    @Test(priority = 0)
    public void createAccount1() {
        commonActions.waitFor(10);
        Assert.fail("intentionally failing the create account 1");
    }

    @Test(priority = 0)
    public void createAccount2() {
        commonActions.waitFor(5);
    }

    @Test(priority = 1, dependsOnMethods = "createAccount1", alwaysRun = true)
    public void login1() {
        commonActions.waitFor(5);
    }

    @Test(priority = 1, dependsOnMethods = "createAccount2")
    public void login2() {
        commonActions.waitFor(5);
        Assert.fail("intentionally failing the create account 1");
    }

    @Test(priority = 2, dependsOnMethods = "login1")
    public void logout1() {
        commonActions.waitFor(5);
    }

    @Test(priority = 2, dependsOnMethods = "login2", alwaysRun = false)
    public void logout2() {
        commonActions.waitFor(5);
    }
}
