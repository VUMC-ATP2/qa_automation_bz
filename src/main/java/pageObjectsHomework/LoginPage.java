package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameField = By.id("user-name");

    public WebElement getUsernameField() {
        return driver.findElement(usernameField);
    }

    public void setUsername(String value) {
        driver.findElement(usernameField).sendKeys(value);
    }

    private By passwordField = By.id("password");

    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }

    public void setPassword(String value) {
        driver.findElement(passwordField).sendKeys(value);
    }

    private By loginButton = By.id("login-button");

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
