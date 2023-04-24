package tests.HomePageTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage.HomePage;
import tests.BaseTest;

public class HomePageTest extends BaseTest {
    private WebDriver driver;
    private HomePage homePage;
    private Object WebDriverManager;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver112.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.vodafone.ro");
        homePage = new HomePage(driver);
    }

    @Test
    public void testSearch() {
        homePage.enterSearchText("iPhone");
        // Add assertions or actions to validate search functionality
    }

    public void testContactButton() {
        homePage.clickContactButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.vodafone.ro/ro/contact");
    }


    public void tearDown() {
        driver.quit();
    }

}
