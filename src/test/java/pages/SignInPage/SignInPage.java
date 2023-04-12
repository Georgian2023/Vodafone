package pages.SignInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.BasePage;
import pages.SignInPage.SignInPage;


public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;
    private static WebElement driver;

    private SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }


    private static By contulMeuLocator = By.xpath("//a[@data-testid='header-menu-account']");
    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    private static By loginButtonLocator = By.xpath("//button[@data-testid='login-submit']");

    public SignInPage (WebDriver driver) {
        driver = driver;
    }

    public static void navigateToContulMeu() {
        driver.findElement(contulMeuLocator).click();
    }

    public static void enterCredentials(String username, String password) {
        driver.findElement(By.id(username)).sendKeys(username);
        driver.findElement(By.id(password)).sendKeys(password);
    }

    public static void clickLoginButton() {
        driver.findElement(loginButtonLocator).click();
    }

    public static void login(String username, String password) {
        navigateToContulMeu();
        enterCredentials(username, password);
        clickLoginButton();
    }
}
