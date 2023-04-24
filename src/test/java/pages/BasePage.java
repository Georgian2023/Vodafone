package pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public BasePage(WebDriver driver) {

    }

    public BasePage() {
    }

    public static void setUp() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver112.exe");
        driver = new ChromeDriver();
        String url = "https://www.vodafone.ro";
        driver.get(url);

        LOG.info("Open browser maximmize");
        Dimension dimension = new Dimension(1366, 768);
        driver.manage().window().setSize(dimension);

    }

    public static void tearDown() {
        LOG.info("Close the browser");
        driver.quit();
    }

    public static String returnBAseUrl() {
        return "https://www.vodafone.ro";
    }

    public static String getBaseUrl() {
        String baseUrl = returnBAseUrl();
        if (baseUrl != null) {
            return baseUrl.replace("https://www.vodafone.ro", "");
        }
        return baseUrl;
    }

    public static void sleep(long ms){
        try {
            Thread.sleep(ms);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


}



