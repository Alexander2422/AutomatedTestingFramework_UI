package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.WebDriverUtils.driver;

public class AlertUtilities extends WebDriverUtils {


    public boolean isAlert = false;

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public String getAlertMessage() {
        Alert alert = driver.switchTo().alert();
        return alert.getText();
    }

    public boolean countUntilAlertAppears(int timeToWait) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeToWait));
        if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
            isAlert = true;
        }
        return isAlert;
    }

    public void writeInPromptBox(String answer, String textToWrite) throws InterruptedException {
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys(textToWrite);
        if (answer.toLowerCase().equals("yes")) {
            promptAlert.accept();
        } else {
            answer.toLowerCase().equals("cancel");
        }
    }
}
