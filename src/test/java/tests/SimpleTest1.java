package tests;

import org.testng.annotations.Test;

public class SimpleTest1 {

    @Test //annotation
    public void test1() { // test method
        System.out.println("test 1 is running");
    }

    @Test
    public void test2() {
        System.out.println("test 2 is running");

    }

    @Test(enabled = false)
    public void test3() {
        System.out.println("test 3 is running");

        for (int f = 0; f <= 5; f++) {
            System.out.println(f);
        }
    }
}
