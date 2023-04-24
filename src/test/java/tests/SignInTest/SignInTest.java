package tests.SignInTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SignInPage.SignInPage;
import tests.BaseTest;

public class SignInTest extends BaseTest {
    private WebDriver driver;
    private String baseUrl = "https://www.vodafone.ro";
    private String email = "0727470129";
    private String password = "Powerzone1983";

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver112.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void signInWithValidCredentials() {
        SignInPage signInPage = new SignInPage(driver);
        SignInPage.enterEmail(email);
        SignInPage.enterPassword(password);
        SignInPage.clickSignInButton();

        String expectedUrl = "https://www.vodafone.ro/myvodafone/dashboard";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
