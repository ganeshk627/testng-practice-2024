package tests;

import org.testng.annotations.Test;

public class SimpleTest {

    @Test //annotation
    public void test1() { // test method
        System.out.println("test 1 is running");
    }

    @Test
    public void test2() {
        System.out.println("test 2 is running");
    }

    @Test
    public void test3() {
        System.out.println("test 3 is running");

        for (int f = 0; f <= 5; f++) {
            System.out.println(f);
        }
    }

    // No @Test, so it's not considered as a test
    public void test4() {
        System.out.println("I am test 4");
    }

}
