package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage{
    @FindBy (css=".jss116")
    WebElement harelLogo;
    public Header(WebDriver driver) {
        super(driver);
    }
}
