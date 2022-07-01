package mavenTestNGHomework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebpageTest {
    ChromeDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        this.driver = new ChromeDriver();
    }

    @Test
    public void webpageTest() {
        driver.get("https://speedtest.net");
        Assert.assertEquals(driver.getTitle(), "Speedtest by Ookla - The Global Broadband Speed Test");
    }
    @Test
    public void webpageTestTwo() {
        driver.get("https://swedbank.lv");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getTitle(), "Sākumlapa - Swedbank");
    }

    @AfterMethod(alwaysRun = true)
        public void closeBrowser() {
            driver.close();
            driver.quit();
        }
}