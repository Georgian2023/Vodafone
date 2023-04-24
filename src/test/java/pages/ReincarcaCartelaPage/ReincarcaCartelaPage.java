package pages.ReincarcaCartelaPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class ReincarcaCartelaPage extends BasePage {
    private WebDriver driver;
    private By rechargeButton = By.id("your-recharge-button-id");

    public ReincarcaCartelaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.vodafone.ro/");
    }

    public void clickRechargeButton() {
        LOG.info("Click reincarca o cartela");
        driver.findElement(rechargeButton).click();
    }
}
