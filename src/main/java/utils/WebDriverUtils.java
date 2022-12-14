package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class WebDriverUtils {

    public static WebDriver driver;

    public static void webDriverCreation() {

        //region BonnieGarciaDriver
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setAcceptInsecureCerts(true);
//        chromeOptions.setCapability(UNHANDLED_PROMPT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
//
//
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(chromeOptions);
//        driver.manage().window().maximize();

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setAcceptInsecureCerts(true);

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(firefoxOptions);
        driver.manage().window().maximize();

        //endregion

        //region clearCache
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        String siteLink = "chrome://settings/clearBrowserData";
//        driver.get(siteLink);
//
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        //get clear cache button
//        WebElement clearBtn = (WebElement) js.executeScript("return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#main\").shadowRoot.querySelector(\"settings-basic-page\").shadowRoot.querySelector(\"#basicPage > settings-section:nth-child(9) > settings-privacy-page\").shadowRoot.querySelector(\"settings-clear-browsing-data-dialog\").shadowRoot.querySelector(\"#clearBrowsingDataConfirm\")");
//        //Click
//        clearBtn.click();
        //endregion
    }

    public static void webDriverTeardown() {
        //driver.close();
        driver.quit();
    }
}
