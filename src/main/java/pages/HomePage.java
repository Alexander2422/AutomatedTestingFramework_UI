package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {


    private By registerButton = By.xpath("//a[contains(@href,'register.htm')]");
    private By usernameInput = By.xpath("//input[@name='username']");
    private By passwordInput = By.xpath("//input[@name='password']");

    public void clickRegisterButton() {
        clickElement(registerButton);
    }

    public static class StaticLinks{
        public static String homepageUrlParabank ="https://parabank.parasoft.com/parabank/index.htm";
        public static String homepageTheInternet ="https://the-internet.herokuapp.com/";
        public static String homepageDemoQA="https://demoqa.com/alerts";
        public static String headingText="";

        public void setHeadingText(String headingText) {
            this.headingText= headingText;
        }
        public static String getHeadingText() {
            return headingText;
        }
    }

}
