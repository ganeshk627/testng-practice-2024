package tests.attributes;

import org.testng.annotations.Test;

public class IncludeExcludeTest {

    @Test //annotation
    public void test1() { // test method
        System.out.println("test 1 is running");
    }

    @Test(enabled = false) // attribute 'enabled'
    public void test2() {
        System.out.println("test 2 is running");
    }

    @Test(enabled = true) // attribute 'enabled'
    public void test3() {
        System.out.println("test 3 is running");

        for (int f = 0; f <= 5; f++) {
            System.out.println(f);
        }
    }

    @Test
    public void test4() {
        System.out.println("I am test 4");
    }
}
