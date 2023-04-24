package pages.ReincarcaCartelaPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ReincarcaCartelaPage extends BasePage {

    private By cookieButton = By.xpath("//button[@id= 'onetrust-pc-btn-handler']");
    private WebDriver driver;
    private By rechargeButton = By.id("Reîncarcă o cartelă");

    public ReincarcaCartelaPage(WebDriver driver) {
        this.driver = driver;
    }

    public static ReincarcaCartelaPage getInstance() {
        return null;

    }

    public void open() {
        driver.get("https://www.vodafone.ro/");
    }

    public void clickOnCookieButton(){
        LOG.info("Click on cookie button");
        driver.findElement(cookieButton).click();

    }
    public void clickRechargeButton() {
        LOG.info("Click reincarca o cartela");
        driver.findElement(rechargeButton).click();
    }
}
