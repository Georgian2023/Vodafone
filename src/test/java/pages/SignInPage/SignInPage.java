package pages.SignInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;
    private static WebElement driver;

    public SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }


    private static final By contulMeuLocator = By.xpath("//a[@data-testid='header-menu-account']");
    private final By usernameLocator = By.id("username");
    private final By passwordLocator = By.id("password");
    private final By loginButtonLocator = By.xpath("//button[@data-testid='login-submit']");
    private final By signInPageDisplayed = By.id("Intră în cont");

    public SignInPage(WebDriver driver) {

    }

    public static void navigateToContulMeu() {
        LOG.info("Click to contul meu");
        driver.findElement(contulMeuLocator).click();
    }

    public static void enterCredentials(String username, String password) {
        LOG.info("Enter password an username");
        driver.findElement(By.id(username)).sendKeys(username);
        driver.findElement(By.id(password)).sendKeys(password);
    }

    public static void enterEmail(String email) {
    }

    public static void enterPassword(String password) {
    }

    public static void clickSignInButton() {
    }

    public void clickLoginButton() {
        LOG.info("Click to login button");
        driver.findElement(loginButtonLocator).click();
    }
    public boolean isSignInPageDisplayed() {
        LOG.info("Sign in page displayed");
        return driver.findElement(signInPageDisplayed).isDisplayed();
    }

}