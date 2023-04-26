package tests.SignUpTest;

import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SignUpTest extends BaseTest {
    private String baseUrl = "https://www.vodafone.ro";
    private String email = "nita.georgian.pfa@gmail.com";
    private String password = "Powerlive2023@";
    private String confirmPassword ="Powerlive2023@";
    private String newUrl = getBaseUrl()+ "/login";
    private Object signUPage;

    @Test
    public void signUpWithValidCredentials() {
        driver.get(newUrl);

        signUpPage.enterEmail(email);
        signUpPage.enterPassword(password);



    }
}