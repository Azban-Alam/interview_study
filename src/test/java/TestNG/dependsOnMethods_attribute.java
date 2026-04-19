package TestNG;

import org.testng.annotations.Test;

public class dependsOnMethods_attribute {

    @Test
    public void login() {
        System.out.println("Login successful");
    }

    @Test(dependsOnMethods = "login")
    public void accessDashboard() {
        System.out.println("Dashboard accessed");
    }

    @Test(dependsOnMethods = "accessDashboard")
    public void logout() {
        System.out.println("Logout successful");
    }
}
