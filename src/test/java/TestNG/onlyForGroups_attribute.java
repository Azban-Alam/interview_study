package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class onlyForGroups_attribute {

    @BeforeMethod(onlyForGroups = {"admin"})
    public void setupAdmin() {
        System.out.println("Setting up for admin group");
    }

    @AfterMethod(onlyForGroups = {"admin"})
    public void teardownAdmin() {
        System.out.println("Cleaning up after admin group");
    }

    @Test(groups = "admin")
    public void testAdminFeature() {
        System.out.println("Running admin test");
    }

    @Test(groups = "user")
    public void testUserFeature() {
        System.out.println("Running user test");
    }
}
