package tests.SignInTest;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;


public class SignInTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignInTest.class);
    private String getBaseUrl;
    private String newUrl = getBaseUrl;

    private By SignInPage;

    @Test
    public void testLogin() {

        String username = "0727470129";
        String password = "Powerzone1983";


        LOG.info("Verify if sign in page is displayed");
        Assert.assertTrue(driver.findElement(SignInPage).isDisplayed(), "Login failed");

}

}

