package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DestinationsPage extends Header{
    @FindBy (css="[data-hrl-bo=\"loader\"]")
    WebElement loader;
    @FindBy (css="[alt=\"asia\"]")
    WebElement asiaBtn;
    @FindBy (css="button[data-hrl-bo=\"wizard-next-button\"]")
    WebElement moveToDatePickerBtn;
    public DestinationsPage(WebDriver driver) {
        super(driver);
    }

    public DestinationsPage waitForLoad(){
        waitFor(harelLogo);
        return this;
    }

    public DestinationsPage clickAsia() {
        asiaBtn.click();
        waitForLoaderEnd();
        return this;
    }

    public void clickMoveToDatePicker() {
        moveToDatePickerBtn.click();
    }

    public DestinationsPage waitForLoaderEnd() {
        try {
        waitFor(loader);
            wait.until(ExpectedConditions.invisibilityOf(loader));
        } catch (Exception TimeoutException) {}
        return this;
    }
}
