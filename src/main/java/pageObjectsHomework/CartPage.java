package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By addedProduct = By.xpath("//*[@class='inventory_item_name']");

    public WebElement getAddedProduct() {
        return driver.findElement(addedProduct);
    }

    private By checkoutButton = By.id("checkout");

    public void clickChekoutButton() {
        driver.findElement(checkoutButton).click();
    }
}
