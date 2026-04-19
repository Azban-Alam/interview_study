package TestNG;

import org.testng.annotations.Test;

public class dependsOnGroups_attribute {

    @Test(groups = "init")
    public void startServer() {
        System.out.println("Server started");
    }

    @Test(groups = "init")
    public void connectDatabase() {
        System.out.println("Database connected");
    }

    @Test(groups = "auth", dependsOnGroups = "init")
    public void loginUser() {
        System.out.println("User logged in");
    }

    @Test(groups = "auth", dependsOnGroups = "init")
    public void loadUserData() {
        System.out.println("User data loaded");
    }

    @Test(dependsOnGroups = {"init", "auth"})
    public void accessDashboard() {
        System.out.println("Dashboard accessed");
    }
}