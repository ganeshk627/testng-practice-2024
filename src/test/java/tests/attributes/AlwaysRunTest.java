package tests.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MyUtils;


public class AlwaysRunTest {
MyUtils myUtils = new MyUtils();

    @Test(priority = 0)
    public void createAccount1() {
        myUtils.waitFor(10);
        Assert.fail("intentionally failing the create account 1");
    }

    @Test(priority = 0)
    public void createAccount2() {
        myUtils.waitFor(5);
    }

    @Test(priority = 1, dependsOnMethods = "createAccount1", alwaysRun = true)
    public void login1() {
        myUtils.waitFor(5);
    }

    @Test(priority = 1, dependsOnMethods = "createAccount2")
    public void login2() {
        myUtils.waitFor(5);
        Assert.fail("intentionally failing the create account 1");
    }

    @Test(priority = 2, dependsOnMethods = "login1")
    public void logout1() {
        myUtils.waitFor(5);
    }

    @Test(priority = 2, dependsOnMethods = "login2", alwaysRun = false)
    public void logout2() {
        myUtils.waitFor(5);
    }
}
