package tests.SignInTest;


import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SignInTest extends BaseTest {
    private String baseUrl = "https://www.vodafone.ro";
    private String email = "0727470129";
    private String password = "Powerzone1983";
    private String newUrl = getBaseUrl()+ "/login";

    @Test
    public void signInWithValidCredentials() {
        driver.get(newUrl);

        signInPage.enterEmail(email);
        signInPage.enterPassword(password);
        signInPage.clickSignInButton();

}
}
