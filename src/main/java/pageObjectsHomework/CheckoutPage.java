package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstnameField = By.id("first-name");

    public By getFirstnameField() {
        return firstnameField;
    }

    public void setFirstname(String value) {
        driver.findElement(firstnameField).sendKeys(value);
    }

    private By lastnameField = By.id("last-name");

    public By getLastname() {
        return lastnameField;
    }

    public void setLastname(String value) {
        driver.findElement(lastnameField).sendKeys(value);
    }

    private By zipcodeField = By.id("postal-code");

    public By getZipcode() {
        return zipcodeField;
    }

    public void setZipcode(String value) {
        driver.findElement(zipcodeField).sendKeys(value);
    }

    private By continueButton = By.id("continue");

    public void clickContinueButton() {
        driver.findElement(continueButton).click();
    }

    private By errorButton = By.xpath("//*[@class='error-message-container error']");

    public WebElement getErrorButton() {
        return driver.findElement(errorButton);
    }
}
