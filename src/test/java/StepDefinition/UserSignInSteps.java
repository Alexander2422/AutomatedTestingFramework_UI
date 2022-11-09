package StepDefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.junit.Assert;
import pages.HomePageDemoQA;
import pages.SignUpPage;

import pages.HomePage;
import utils.Utilities;


public class UserSignInSteps {

    Utilities utilities = new Utilities();
    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();
    SignUpPage.StaticInfo staticInfo = new SignUpPage.StaticInfo();
    Faker faker = new Faker();
    String homepage="https://parabank.parasoft.com/parabank/index.htm";

    @Given("I set homepage link")
    public void iSetHomepageLink() {

        utilities.openLink(homepage);
    }

    @When("I click on Register")
    public void iClickOnRegister() {
        homePage.clickRegisterButton();
    }

    @When("I set {string} FirstName,{string} LastName, {string} Address, {string} City, {string} State, {string} ZipCode, {string} Phone, {string} Ssn , {string} Username, {string} Password, {string} ConfirmationPassword")
    public void iSetFirstNameLastNameAddressCityStateZipCodePhoneSsnUsernamePasswordConfirmationPassword(String firstNameType, String lastNameType, String addressType, String cityType, String stateType, String zipCodeType, String phoneType, String ssnType, String usernameType, String passwordType, String passwordConfirmationType) throws InterruptedException {
        String firstName = "", lastName = "", address = "", city = "", state = "", zipCode = "", phone = "", ssn = "", username = "", password = "", passwordConfirmation;

        //region firstName
        if (firstNameType.equals("valid")) {
            firstName = faker.name().firstName();
            staticInfo.setFirstName(firstName);
        } else if (firstNameType.equals("invalid")) {
            firstName = "!@#$$%%%";
        } else {
            System.out.println("type not defined");
        }
        signUpPage.fillInputFirstName(firstName);
        //endregion

        //region lastName
        if (lastNameType.equals("valid")) {
            lastName = faker.name().lastName();
            staticInfo.setLastName(lastName);
        } else if (firstNameType.equals("invalid")) {
            lastName = "!@#$$%%%";
        } else {
            System.out.println("type not defined");
        }
        signUpPage.fillInputLastName(lastName);
        //endregion

        //region address
        if (addressType.equals("valid")) {
            address = faker.address().fullAddress();
            staticInfo.setAddress(address);
        } else if (firstNameType.equals("invalid")) {
            address = "!@#$$%%%";
        } else {
            System.out.println("type not defined");
        }
        signUpPage.fillInputAddress(address);
        //endregion

        //region city
        if (cityType.equals("valid")) {
            city = faker.address().city();
            staticInfo.setCity(city);
        } else if (cityType.equals("invalid")) {
            city = "!@#$$%%%";
        } else {
            System.out.println("type not defined");
        }
        signUpPage.fillInputCity(city);

        //endregion

        //region state
        if (stateType.equals("valid")) {
            state = faker.address().state();
            staticInfo.setState(state);
        } else if (stateType.equals("invalid")) {
            state = "!@#$$%%%";
        } else {
            System.out.println("type not defined");
        }
        signUpPage.fillInputState(state);
        //endregion

        //region zipCode
        if (zipCodeType.equals("valid")) {
            zipCode = faker.address().zipCode();
            staticInfo.setZipCode(zipCode);
        } else if (stateType.equals("invalid")) {
            state = "!@#$$%%%";
        } else {
            System.out.println("type not defined");
        }
        signUpPage.fillInputZipCode(zipCode);
        //endregion

        //region phone
        if (phoneType.equals("valid")) {
            phone = faker.phoneNumber().phoneNumber();
            staticInfo.setPhone(phone);
        } else if (stateType.equals("invalid")) {
            phone = "!@#$$%%%";
        } else {
            System.out.println("type not defined");
        }
        signUpPage.fillInputPhone(phone);
        //endregion

        //region SSn
        if (ssnType.equals("valid")) {
            ssn = faker.idNumber().ssnValid();
            staticInfo.setSsn(ssn);
        } else if (stateType.equals("invalid")) {
            ssn = faker.idNumber().invalid();
        } else {
            System.out.println("type not defined");
        }
        signUpPage.fillInputSsn(ssn);
        //endregion

        //region username
        if (usernameType.equals("valid")) {
            //username = "cab" + signUpPage.numberRandomGeneration();
            //username = SignUpPage.StaticInfo.getLastName() + SignUpPage.StaticInfo.getFirstName();
            username = SignUpPage.StaticInfo.getLastName() + signUpPage.numberRandomGeneration();
            staticInfo.setUsername(username);
        } else if (usernameType.equals("invalid")) {
            username = faker.slackEmoji().emoji();
        } else {
            System.out.println("type not defined");
        }
        signUpPage.fillInputUsername(username);
        //endregion

        //region password
        if (passwordType.equals("valid")) {
            password = faker.internet().password();
            staticInfo.setPassword(password);
        } else if (stateType.equals("invalid")) {
            password = "x";
        } else {
            System.out.println("type not defined");
        }
        signUpPage.fillInputPassword(password);
        //endregion

        //region passwordConfirmation
        if (passwordConfirmationType.equals("valid")) {
            password = staticInfo.getPassword();
        } else if (stateType.equals("invalid")) {
            password = "x";
        } else {
            System.out.println("type not defined");
        }
        signUpPage.fillInputPasswordConfirmation(password);
        //endregion

    }

    @When("I click on Register user")
    public void iClickOnRegisterUser() throws InterruptedException {
        signUpPage.clickRegisterButton();
        signUpPage.waitForLogoutButton();
        Thread.sleep(3000);
    }

    @Then("I see Welcome FirstName,LastName")
    public void iSeeWelcomeFirstNameLastName() {
        Assert.assertEquals("Welcome " + SignUpPage.StaticInfo.getUsername(),signUpPage.welcomeMessageUsername());
    }

}
