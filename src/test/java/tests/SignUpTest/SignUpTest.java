package tests.SignUpTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.SignUpPage.SignUpPage;
import tests.BaseTest;

public class SignUpTest extends BaseTest {
    @Test
    public void signUpWithValidCredentials() {
        WebDriver driver = null;
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterFirstName("Nita");
        signUpPage.enterLastName("Georgian");
        signUpPage.enterEmail("nita.georgian.pfa@gmail.com");
        signUpPage.enterPassword("Powerlive2023");
        signUpPage.enterConfirmPassword("Powerlive2023");
        signUpPage.clickSubmitButton();

    }
    @Test
    public void signUpWithInvalidEmail() {
        WebDriver driver = null;
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterFirstName("Nita");
        signUpPage.enterLastName("Georgian");
        signUpPage.enterEmail("nita.georgian.pfa@gmail.ro");
        signUpPage.enterPassword("Powerlive2023");
        signUpPage.enterConfirmPassword("Powerlive2023");
        signUpPage.clickSubmitButton();

    }
    @Test
    public void signUpWithMismatchedPasswords() {
        WebDriver driver = null;
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.enterFirstName("Nita");
        signUpPage.enterLastName("Georgian");
        signUpPage.enterEmail("nita.georgian.pfa@gmail.com");
        signUpPage.enterPassword("Powerlive2023");
        signUpPage.enterConfirmPassword("Powerlive2022");
        signUpPage.clickSubmitButton();


    }
}
