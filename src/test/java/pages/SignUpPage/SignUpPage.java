package pages.SignUpPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SignUpPage extends BasePage {

    public static final Logger LOG = LoggerFactory.getLogger(SignUpPage.class);
    public static SignUpPage instance;

    public SignUpPage() {
    }

    public static SignUpPage getInstance() {
        if (instance == null) {
            instance = new SignUpPage();
        }
        return instance;
    }

    private final By contulMeuLocator = By.xpath("//a[@data-testid='header-menu-account']");
    private final By creeateMyAccount = By.xpath("//span[@id= 'Creează-ți cont']");
    private final By emailAccount = By.xpath("//input[@id='identifier']");
    private final By passwordAccount = By.xpath("//input[@id='password']");
    private final By confirmPasswordAccount = By.xpath("//input[@id='confirm_password']");
    private final By submitBtn = By.xpath("//button[@class= 'form-button primary']");

    public SignUpPage(WebDriver driver) {

    }

    public void navigateToContulMeuLocator() {
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

    public  void enterPasswordAccount(String password) {
        LOG.info("Enter password");
        driver.findElement(passwordAccount).sendKeys(password);
    }


    public void enterConfirmPassword(String confirmPassword) {
        LOG.info("Confirm password");
        driver.findElement(confirmPasswordAccount).sendKeys(confirmPassword);

    }

    public void clickSubmitButton() {
        LOG.info("Click submit button");
        driver.findElement(submitBtn).click();

    }

    public void enterPassword(String password) {
    }
    private String newUrl = getBaseUrl() + "/login";
}

