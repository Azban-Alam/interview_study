package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups = "smoke")
public class inheritGroups_attribute {

    @BeforeMethod(inheritGroups = true)
    public void setup() {
        System.out.println("Setup for smoke group");
    }

    @Test
    public void testA() {
        System.out.println("Running testA");
    }
}