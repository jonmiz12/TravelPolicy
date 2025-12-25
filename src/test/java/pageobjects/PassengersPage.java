package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PassengersPage extends Header{

    @FindBy (css="[data-hrl-bo=\"screen_title\"]")
    WebElement screenTitle;
    public PassengersPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPassengersPageOpened(){
        try {
            waitFor(screenTitle);
        } catch(Exception TimeoutException) {
            return false;
        }
        return true;
    }
}
