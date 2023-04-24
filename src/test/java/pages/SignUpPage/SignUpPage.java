package pages.SignUpPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class SignUpPage extends BasePage {
    private By firstNameField = By.id("firstName");
    private By lastNameField = By.id("lastName");
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmPassword");
    private By submitButton = By.cssSelector("button[type='submit']");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public static SignUpPage getInstance() {
        return null;
    }

    public void enterFirstName(String firstName) {
        LOG.info("Enter first name");
        driver.findElement(firstNameField).sendKeys();

    }

    public void enterLastName(String lastName) {
        LOG.info("Enter last name");
        driver.findElement(lastNameField).sendKeys();

    }

    public void enterEmail(String email) {
        LOG.info("Enter email");
        driver.findElement(emailField).sendKeys(email);

    }

    public void enterPassword(String password) {
        LOG.info("Enter password");
       driver.findElement(passwordField).sendKeys(password);

    }

    public void enterConfirmPassword(String confirmPassword) {
        LOG.info("Confirm password");
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);

    }

    public void clickSubmitButton() {
        LOG.info("Click submit button");
        driver.findElement(submitButton).click();

    }
}

