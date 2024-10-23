package tests;

import org.testng.annotations.*;

public class BeforeAfterAnnotationTest {

    // Before Annotation
    @BeforeMethod
    public void beforeEachMethod() {
        System.out.println("Before each method!");
    }
    @BeforeClass
    public void beforeEachClass() {
        System.out.println("Before each class!");
    }


    // After Annotation
    @AfterMethod
    public void afterEachMethod() {
        System.out.println("After each method!");
    }
    @AfterClass
    public void afterEachClass() {
        System.out.println("After each class!");
    }



    @Test
    public void test2() {
        System.out.println("test 2 is running");
    }

    @Test //annotation
    public void test1() { // test method
        System.out.println("test 1 is running");
    }

    @Test(enabled = true)
    public void test3() {
        System.out.println("test 3 is running");

        for (int f = 0; f <= 5; f++) {
            System.out.println(f);
        }
    }
}
