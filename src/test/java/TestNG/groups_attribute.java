package TestNG;

import org.testng.annotations.Test;

public class groups_attribute {

    @Test(groups = "smoke")
    public void testLogin() {
        System.out.println("Smoke test: Login");
    }

    @Test(groups = "regression")
    public void testAddToCart() {
        System.out.println("Regression test: Add to cart");
    }

    @Test(groups = {"smoke", "regression"})
    public void testCheckout() {
        System.out.println("Both smoke and regression: Checkout");
    }
}