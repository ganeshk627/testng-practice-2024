package tests.attributes;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test //annotation
    public void test1() { // test method
        System.out.println("test 1 is running");
    }

    @Test(priority = 1)
    public void test2() {
        System.out.println("test 2 is running");
    }

    @Test(priority = 2)
    public void count() {
        System.out.println("test 3 is running");

        for (int f = 0; f <= 5; f++) {
            System.out.println(f);
        }
    }

    @Test(priority = 0, enabled = true)
    public void test4() {
        System.out.println("I am test 4");
    }

    @Test
    public void classrep() {
        System.out.println("class rep is running");
    }

    @Test
    public void teacher() {
        System.out.println("teacher is running");
    }
}
