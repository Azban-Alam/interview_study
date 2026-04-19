package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class alwaysRun_Attribute {

    @Test
    public void testA() {
        System.out.println("Running testA");
        // Simulate failure
        throw new RuntimeException("testA failed");
    }

    @Test(dependsOnMethods = "testA")
    public void testB() {
        System.out.println("Running testB");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        System.out.println("Cleaning up after test (always runs)");
    }
}