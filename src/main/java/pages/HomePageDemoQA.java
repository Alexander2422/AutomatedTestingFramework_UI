package pages;

import org.openqa.selenium.By;
//import resources.Urls;
import org.openqa.selenium.WebElement;
import utils.AlertUtilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class HomePageDemoQA extends BasePage {
    AlertUtilities alertUtilities = new AlertUtilities();
    private By alerts = By.xpath("//li[@id='item-1']//*[text()='Alerts']");
    private By clickMe5Seconds = By.xpath("//button[@id='timerAlertButton']");
    private By alertsFrameWindows = By.xpath("//div[@class='header-text' and text()='Alerts, Frame & Windows']");
    private By clickPromptButton = By.xpath("//button[@id='promtButton']");
    private By promptAnswerInDom = By.xpath("//span[@id='promptResult']");
    private By browserWindows = By.xpath("//li[@class='btn btn-light ']//*[text()='Browser Windows']");
    private By newTabButton = By.xpath("//button[@id='tabButton']");
    private By headingSampleText = By.xpath("//h1[@id='sampleHeading']");

    public void clickOnAlerts() {
        clickElement(alerts);
    }

    public void clickOn5SecondAlert() {
        clickElement(clickMe5Seconds);
    }

    public void openHomePage() {
        openLink(HomePage.StaticLinks.homepageDemoQA);
    }

    public void clickOnAlertsFrameWindow() {
        clickElement(alertsFrameWindows);
    }

    public boolean countFiveSecondsAlert(int seconds) {
        return alertUtilities.countUntilAlertAppears(seconds);
    }

    public void clickOnPromptButton() {
        clickElement(clickPromptButton);
    }

    public String alertMessage() {

        return alertUtilities.getAlertMessage();
    }

    public void pressOkOnAlert() {

        alertUtilities.acceptAlert();
    }

    public void writeAndClosePromptBox(String answer, String whatToWrite) throws InterruptedException {
        alertUtilities.writeInPromptBox(answer, whatToWrite);
    }

    public String promptResult() {
        return getTextOfElement(promptAnswerInDom);
    }

    public WebElement promptElement() {
        return driver.findElement(By.id("promtButton"));
    }

    public void waitForPromptResult() {
        waitOnElement(promptAnswerInDom, 3);
    }

    public void clickOnBrowserWindows() {
        clickElement(browserWindows);
    }

    public void clickOnNewTabButton() {
        clickElement(newTabButton);
    }

    public String readHeadingText() {
        return getTextOfElement(headingSampleText);
    }

    public void switchToNewTab() {
        Set<String> handles = driver.getWindowHandles();
        List<String> ls = new ArrayList<String>(handles);

        String homePageDemoQA = ls.get(0);
        String newlyOpenedTab = ls.get(1);
        driver.switchTo().window(newlyOpenedTab);
    }

}


