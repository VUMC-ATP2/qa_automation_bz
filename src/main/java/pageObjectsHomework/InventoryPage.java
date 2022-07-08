package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    private By addToCartButton = By.id("add-to-cart-sauce-labs-bolt-t-shirt");

    public void clickAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    private By shoppingCart = By.className("shopping_cart_link");

    public void clickShoppingCart() {
        driver.findElement(shoppingCart).click();
    }

    private By menuButton = By.id("react-burger-menu-btn");

    public void clickMenuButton() {
        driver.findElement(menuButton).click();
    }

    private By logoutButton = By.id("logout_sidebar_link");

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }
}
