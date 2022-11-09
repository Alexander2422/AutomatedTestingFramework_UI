package StepDefinition;

import io.cucumber.java.bs.Ali;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import pages.HomePage;
import pages.HomePageDemoQA;

import utils.AlertUtilities;
import utils.Utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static utils.WebDriverUtils.driver;

public class TestFeatureSteps {


    Utilities utilities = new Utilities();
    HomePageDemoQA homePageDemoQA = new HomePageDemoQA();
    HomePage.StaticLinks staticLinks =new HomePage.StaticLinks();


    //region Common
    @Given("I set homepage link for demoQA")
    public void iSetHomepageLinkForDemoQA() {
        utilities.openLink(HomePage.StaticLinks.homepageDemoQA);
    }
    //endregion

    //region 5 seconds alert

    @When("I click on Alerts, Frame & Windows to make alerts visible")
    public void iClickOnAlertsFrameWindowsToMakeAlertsVisible() {
        homePageDemoQA.clickOnAlertsFrameWindow();
    }

    @When("I click on Alerts")
    public void iClickOnAlerts() {
        homePageDemoQA.clickOnAlerts();
    }

    @When("I click on button that will give an alert in five seconds")
    public void iClickOnButtonThatWillGiveAnAlertInFiveSeconds() {
        homePageDemoQA.clickOn5SecondAlert();
    }

    @Then("I check if alert appeared in {int} seconds")
    public void iCheckIfAlertAppearedInSeconds(int seconds) {
        Assert.assertTrue(homePageDemoQA.countFiveSecondsAlert(seconds));
    }

    @Then("I check if displayed text is {string} correct")
    public void iCheckIfDisplayedTextIsCorrect(String alertText) {
        Assert.assertEquals(alertText, homePageDemoQA.alertMessage());
    }

    @When("I close the alert by clicking ok")
    public void iCloseTheAlertByClickingOk() {
        homePageDemoQA.pressOkOnAlert();
    }

    //region PromptButton
    @When("I click on prompt box button")
    public void iClickOnPromptBoxButton() {
        homePageDemoQA.clickOnPromptButton();
    }

    @When("I write the {string} in the prompt and click {string} in the box")
    public void iWriteTheInThePromptAndClickInTheBox(String textToWrite, String yesOrCancel) throws InterruptedException {
        homePageDemoQA.writeAndClosePromptBox(yesOrCancel, textToWrite);
    }



    @Then("I check if the text was written")
    public void iCheckIfTheTextWasWritten() throws InterruptedException {
        Assert.assertEquals("You entered Welcome",homePageDemoQA.promptResult());
    }

    //region OpeningNewTab
    @When("I click on Browser Windows")
    public void iClickOnBrowserWindows() {
        homePageDemoQA.clickOnBrowserWindows();
    }

    @When("I press on New Tab")
    public void iPressOnNewTab() {
        homePageDemoQA.clickOnNewTabButton();
    }

    @When("I read the heading of the page")
    public void iReadTheHeadingOfThePage() {
        staticLinks.setHeadingText(homePageDemoQA.readHeadingText());
    }

    @Then("I check the written text")
    public void iCheckTheWrittenText() {
        Assert.assertEquals("This is a sample page",staticLinks.getHeadingText());
    }

    @When("I switch to the new window")
    public void iSwitchToTheNewWindow() {
        homePageDemoQA.switchToNewTab();
    }


    //endregion
}
