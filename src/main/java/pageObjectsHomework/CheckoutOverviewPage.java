package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {
    private WebDriver driver;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    private By productName = By.xpath("//*[@class='inventory_item_name']");

    public WebElement getProductName() {
        return driver.findElement(productName);
    }

    private By price = By.xpath("//*[@class='item_pricebar']");

    public WebElement getPrice() {
        return driver.findElement(price);
    }

    private By finishButton = By.id("finish");

    public void clickFinishButton() {
        driver.findElement(finishButton).click();
    }
}
