package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomeTheInternetPage;
//import resources.Urls;
import utils.Utilities;

public class WelcomeToTheInternetSteps {
    Utilities utilities = new Utilities();
    HomeTheInternetPage homeTheInternetPage = new HomeTheInternetPage();

    //region Common
    @Given("I set homepage link for welcomeToTheInternet")
//    public void iSetHomepageLinkForWelcomeToTheInternet() {
//        utilities.openLink(Urls.homepageTheInternet);
//    }
    //endregion

    //region DropDown
    @When("I click on Dropdown Button")
    public void iClickOnDropdownButton() {
        homeTheInternetPage.clickOnDropdownButton();
    }

    @When("I select DropDown option")
    public void iSelectDropDownOption() {
        homeTheInternetPage.selectOnDropdownList();
    }

    @Then("I check to see if option is selected")
    public void iCheckToSeeIfOptionIsSelected() {
        Assert.assertTrue(homeTheInternetPage.optionSelected());
    }
    //endregion

    // region DragAndDrop
    @When("I click on Drag and Drop Button")
    public void iClickOnDragAndDropButton() {
        homeTheInternetPage.clickOnDragAndDrop();
    }

    @When("I move Box B over box A")
    public void iMoveBoxBOverBoxA() throws InterruptedException {
        homeTheInternetPage.dragBox();
        Thread.sleep(3000);
    }
    @Then("I check to see if box B is in place of box A")
    public void iCheckToSeeIfBoxBIsInPlaceOfBoxA() {
    }


    //endregion
}