package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.SignInPage.SignInPage;

public class BaseTest {
    protected WebDriver driver;
    private Object SignInPage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver112.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.vodafone.ro/");
        SignInPage = new SignInPage(driver);

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}