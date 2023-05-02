package pages.SignInPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class SignInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SignInPage.class);
    public static SignInPage instance;

    public SignInPage() {
    }

    public static SignInPage getInstance() {
        if (instance == null) {
            instance = new SignInPage();
        }
        return instance;
    }


    private final By contulMeuLocator = By.xpath("//a[@data-testid='header-menu-account']");
    private final By loginButtonLocator = By.xpath("//button[@data-testid='login-submit']");
    private final By signInPageDisplayed = By.id("Intră în cont");

    private final By emailAccount = By.xpath("//input[@id='identifier']");
    private final By passwordAccount = By.xpath("//input[@id='current-password']");
    private final By submitBtn = By.xpath("//button[@type='submit']");

    public SignInPage(WebDriver driver) {

    }

    public void navigateToContulMeu() {
        LOG.info("Click to contul meu");
        driver.findElement(contulMeuLocator).click();
    }

    public void enterCredentials(String username, String password) {
        LOG.info("Enter password an username");
        driver.findElement(By.id(username)).sendKeys(username);
        driver.findElement(By.id(password)).sendKeys(password);

    }

    public void enterEmail(String email) {
        LOG.info("Enter email");
        sleep(3000);
        driver.findElement(emailAccount).sendKeys(email);

    }

    public void enterPassword(String password) {
        LOG.info("Enter password");
        driver.findElement(passwordAccount).sendKeys(password);
    }

    public void clickSignInButton() {
        LOG.info("Click sign in button");
        driver.findElement(submitBtn).click();
    }

    public void clickLoginButton() {
        LOG.info("Click to login button");
        driver.findElement(loginButtonLocator).click();
    }

    public boolean isSignInPageDisplayed() {
        LOG.info("Sign in page displayed");
        return driver.findElement(signInPageDisplayed).isDisplayed();
    }

    private String newUrl = getBaseUrl() + "/login";


}