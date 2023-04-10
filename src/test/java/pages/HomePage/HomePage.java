package pages.HomePage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.BasePage;

public class HomePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    public static HomePage instance;

    private HomePage() {
    }

    public static HomePage getInstance() {
        if (instance == null) {
            instance = new HomePage();
        }
        return instance;
    }
     private By logoLocator = By.xpath("//a[@data-testid='header-logo']");
     private By contulMeuLocator = By.xpath("//a[@data-testid='header-menu-account']");
     private By pageTitleLocator = By.xpath("//h1[text()='Autentificare']");


    public boolean isLogoDisplayed() {
        return driver.findElement(logoLocator).isDisplayed();

    }
    public void verifyLogoPresence() {
        Assert.assertTrue(isLogoDisplayed(), "Logo is not displayed");
        driver.findElement(logoLocator).isDisplayed();

    }
    public void navigateToContulMeu() {
        driver.findElement(contulMeuLocator).click();
    }

    public boolean isAutentificarePageDisplayed() {
        return driver.findElement(pageTitleLocator).isDisplayed();
    }

}