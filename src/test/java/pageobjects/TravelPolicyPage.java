package pageobjects;

import org.apache.commons.lang3.Validate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelPolicyPage extends BasePage{
    @FindBy (css = "#logo-harel-logo")
    WebElement harelLogo;
    @FindBy(css="button[data-hrl-bo=\"purchase-for-new-customer\"]")
    WebElement firstTimePurchaseBtn;
    public TravelPolicyPage(WebDriver driver) {
        super(driver);
    }

    public TravelPolicyPage waitForLoad() {
        waitFor(harelLogo);
        return this;
    }

    public void clickFirstTimePurchase() {
        firstTimePurchaseBtn.click();
    }
}
