package seleniumHomework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjectsHomework.*;

public class sauceDemoTests {
    ChromeDriver driver;
    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    CheckoutOverviewPage checkoutOverviewPage;
    CheckoutSuccessPage checkoutSuccessPage;

    @BeforeMethod(alwaysRun = true)
    public void login() {
        this.driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

    @Test
    public void scenarioOne() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        inventoryPage = new InventoryPage(driver);
        inventoryPage.clickAddToCartButton();
        inventoryPage.clickShoppingCart();
        cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getAddedProduct().getText(), "Sauce Labs Bolt T-Shirt");
        cartPage.clickChekoutButton();
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.setFirstname("Baiba");
        checkoutPage.setLastname("Liepa");
        checkoutPage.setZipcode("LV-5003");
        checkoutPage.clickContinueButton();
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        Assert.assertEquals(checkoutOverviewPage.getProductName().getText(), "Sauce Labs Bolt T-Shirt");
        Assert.assertEquals(checkoutOverviewPage.getPrice().getText(), "$15.99");
        checkoutOverviewPage.clickFinishButton();
        checkoutSuccessPage = new CheckoutSuccessPage(driver);
        checkoutSuccessPage.clickBackHomeButton();
    }

    @Test
    public void scenarioTwo() {
        inventoryPage = new InventoryPage(driver);
        inventoryPage.clickShoppingCart();
        cartPage = new CartPage(driver);
        cartPage.clickChekoutButton();
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.setFirstname("");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorButton().getText(), "Error: First Name is required");
        checkoutPage.setFirstname("Baiba");
        checkoutPage.setLastname("");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorButton().getText(), "Error: Last Name is required");
        checkoutPage.setLastname("Liepa");
        checkoutPage.setZipcode("");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorButton().getText(), "Error: Postal Code is required");
        checkoutPage.setZipcode("LV-5003");
        checkoutPage.clickContinueButton();
    }

    @AfterMethod(alwaysRun = true)
    public void logout() {
        inventoryPage.clickMenuButton();
        inventoryPage.clickLogoutButton();
    }

    @AfterTest(alwaysRun = true)
    public void closeWeb() {
        driver.close();
        driver.quit();
    }
}
