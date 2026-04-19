package TestNG;

import org.testng.annotations.Test;

@Test(enabled = false)
public class enabled_attribute {

    public void testA() {
        System.out.println("Skipped");
    }

    public void testB() {
        System.out.println("Also skipped");
    }
    
    @Test(enabled = false)
    public void testLogin() {
        System.out.println("This won't run");
    }
}