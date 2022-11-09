package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.format.SignStyle;

import static pages.HomeTheInternetPage.StaticVar.getSelectedOption;
import static utils.WebDriverUtils.driver;

public class HomeTheInternetPage extends BasePage {
    private By dropdownClick = By.xpath("//a[contains(@href,'/dropdown')]");
    private By dropdownList = By.xpath("//select[contains(@id,'dropdown')]");
    private By option2Selected = By.xpath("//option[@value=2 and @selected='selected']");
    private By dragAndDropButton = By.xpath("//a[contains(@href,'/drag_and_drop')]");
    private By squareA= By.xpath("//div[contains(@id,'column-a')]");
    private By squareB= By.xpath("//div[contains(@id,'column-b')]");

    public Boolean optionSelected() {
        boolean isOption = false;
        if (driver.findElement(option2Selected).getText().equals(getSelectedOption())) {
            isOption = true;
        }
        return isOption;
    }

    public void clickOnDropdownButton() {
        clickElement(dropdownClick);
    }

    public void selectOnDropdownList() {
        selectFromDropdown(dropdownList, getSelectedOption());
    }

    public void clickOnDragAndDrop() {
        clickElement(dragAndDropButton);
    }

    public void dragBox(){
        dragAndDrop(squareB,squareA);
    }


    public static class StaticVar {

        private static String selectedOption = "Option 2";

        public void setSelectedOption(String selected) {
            this.selectedOption = selected;
        }

        public static String getSelectedOption() {
            return selectedOption;
        }
    }
}
