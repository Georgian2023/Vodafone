package pages.HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;
import pages.SignInPage.SignInPage;
import tests.HomePageTest.HomePageTest;

public class HomePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    public static SignInPage instance;
    private static WebElement driver;


    private By searchBox = By.id("search");
    private By contactButton = By.xpath("//a[contains(@href, '/ro/contact')]");


    public HomePage(WebDriver driver) {
        this.driver = (WebElement) driver;
    }

    public static HomePageTest getInstance() {
        return null;
    }


    public void enterSearchText(String searchText) {
        LOG.info("Go to search box");
        driver.findElement(searchBox).sendKeys(searchText);
    }

    public void clickContactButton() {
        LOG.info("Click to contact button");
        driver.findElement(contactButton).click();
    }

}
