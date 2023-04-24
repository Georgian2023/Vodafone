package tests.ReincarcaCartelaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ReincarcaCartelaPage.ReincarcaCartelaPage;
import tests.BaseTest;

import java.util.concurrent.TimeUnit;

public class ReincarcaCartelaTest extends BaseTest{
    private WebDriver driver;
    private ReincarcaCartelaPage reincarcaCartelaPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver112.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        reincarcaCartelaPage = new ReincarcaCartelaPage(driver);
    }

    @Test
    public void testRechargeButton() {
        reincarcaCartelaPage.open();
        reincarcaCartelaPage.clickRechargeButton();

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
