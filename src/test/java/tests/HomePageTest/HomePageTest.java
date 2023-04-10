package tests.HomePageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage.HomePage;
import tests.BaseTest;

public class HomePageTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(HomePageTest.class);
    private By logoLocator;

    @Test
    public void verifyLogoPresence() {
        LOG.info("Verify if Logo is displayed");
        Assert.assertTrue(driver.findElement(logoLocator).isDisplayed(), "Logo is not displayed");
    }

}

