package practice;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserTest {
    ChromeDriver driver;

    @BeforeMethod(alwaysRun = true)//uztaisa, lai nostrādātu pirms katras metodes
    public void openBrowser() {
        //ChromeDriver driver = new ChromeDriver(); - par šo zina tikai tā klases metode, kurā mēs to izveidojam (Before)
        //tāpēc driver. strādātu tika te, bet pie @Test driver nevarētu izsaukt. Tāpēc veido pašā augšā visai klasei kopā un:
        this.driver = new ChromeDriver();
        driver.get("https://google.lv");
    }

    @Test
    public void chromeDriverTest() {
        //  driver.getTitle();- atgriezīs lapas nosaukumu
        Assert.assertEquals(driver.getTitle(), "Google");
        //pārb., ka atvērtās lapas title sakrīt ar norādīto
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)//uztaisa, lai nostrādātu pēc katras metodes
    public void closeBrowser() {
        driver.close();
    }
}
