package pages;

import org.apache.maven.surefire.shared.lang3.ObjectUtils;
import org.openqa.selenium.By;

public class SignUpPage extends BasePage {

    private By inputFirstName = By.xpath("//input[contains(@id,'customer.firstName')]");
    private By inputLastName = By.xpath("//input[contains(@id,'customer.lastName')]");
    private By inputAddress = By.xpath("//input[contains(@id,'address')]");
    private By inputCity = By.xpath("//input[contains(@id,'city')]");
    private By inputState = By.xpath("//input[contains(@id,'state')]");
    private By inputZipCode = By.xpath("//input[contains(@id,'zipCode')]");
    private By inputPhone = By.xpath("//input[contains(@id,'phoneNumber')]");
    private By inputSsn = By.xpath("//input[contains(@id,'ssn')]");
    private By inputUsername = By.xpath("//input[contains(@id,'username')]");
    private By inputPassword = By.xpath("//input[contains(@id,'password')]");
    private By inputPasswordConfirmation = By.xpath("//input[contains(@id,'repeatedPassword')]");
    private By registerButton = By.xpath("//input[contains(@value,'Register')]");
    private By logoutButton = By.xpath("//a[contains(@href,'logout.htm')]");
    private By welcomeMessageUsername=By.xpath("//h1[contains(@class,'title')]");


    public void fillInputFirstName(String valueToFil ){
        sendKeys(inputFirstName,valueToFil);
    }
    public void fillInputLastName(String valueToFil ){
        sendKeys(inputLastName,valueToFil);
    }
    public void fillInputAddress(String valueToFil ){
        sendKeys(inputAddress,valueToFil);
    }
    public void fillInputCity(String valueToFil ){
        sendKeys(inputCity,valueToFil);
    }
    public void fillInputState(String valueToFil ){
        sendKeys(inputState,valueToFil);
    }
    public void fillInputZipCode(String valueToFil ){
        sendKeys(inputZipCode,valueToFil);
    }
    public void fillInputPhone(String valueToFil ){
        sendKeys(inputPhone,valueToFil);
    }
    public void fillInputSsn(String valueToFil ){
        sendKeys(inputSsn,valueToFil);
    }
    public void fillInputUsername(String valueToFil ){
        sendKeys(inputUsername,valueToFil);
    }
    public void fillInputPassword(String valueToFil ){
        sendKeys(inputPassword,valueToFil);
    }
    public void fillInputPasswordConfirmation(String valueToFil ){
        sendKeys(inputPasswordConfirmation,valueToFil);
    }

    public void clickRegisterButton(){
        clickElement(registerButton);
    }
    public void clickLogoutButton(){
        clickElement(logoutButton);
    }
    public void waitForLogoutButton(){
        waitOnElementToBeClickable(logoutButton,3);
    }
    public int numberRandomGeneration(){
        return randomNumberGenerator(500);
    }
    public String welcomeMessageUsername(){
        return getTextOfElement(welcomeMessageUsername);
    }

    public static class StaticInfo {
        private static String firstName="";
        private static String lastName="";
        private static String address="";
        private static String state="";
        private static String city="";
        private static String zipCode="";
        private static String phone="";
        private static String ssn="";
        private static String username="";
        private static String password="";


        public void setFirstName(String fName) {
            this.firstName = fName;
        }
        public static String getFirstName() {
        return firstName;
        }

        public void setLastName(String lName) {
            this.lastName = lName;
        }
        public static String getLastName() {
            return lastName;
        }

        public void setAddress(String address) {
            this.address = address;
        }
        public static String getAddress() {
            return address;
        }

        public void setState(String state) {
            this.state = state;
        }
        public static String getState() {
            return state;
        }

        public void setCity(String city) {
            this.city = city;
        }
        public static String getCity() {
            return city;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }
        public static String getZipCode() {
            return zipCode;}

        public void setPhone(String phone) {
            this.phone = phone;
        }
        public static String getPhone() {
            return phone;
        }

        public void setSsn(String ssn) {
            this.ssn = ssn;
        }
        public static String getSsn() {
            return ssn;
        }

        public void setUsername(String username) {
            this.username = username;
        }
        public static String getUsername() {
            return username;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        public static String getPassword() {
            return password;
        }
    }
}
