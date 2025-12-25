package pageobjects;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DatePickerPage extends Header{
    private final By validDaysBtnsLocator = By.cssSelector("[role=\"presentation\"]>div[class='']>button");
    @FindBy (css="[role=\"presentation\"]>div[class='']>button")
    List<WebElement> validDaysBtns;

    @FindBy (css = "button:not(.Mui-disabled)[aria-pressed=\"true\"]")
    List<WebElement> ChosenDays;
    @FindBy (css="button#nextButton")
    WebElement nextBtn;
    @FindBy(css="button[data-hrl-bo=\"arrow-forward\"][data-hide=\"false\"]")
    WebElement ForwardDatesBtn;
    @FindBy (css=".MuiPickersBasePicker-container")
    List<WebElement> monthContainers;
    public DatePickerPage(WebDriver driver) {
        super(driver);
    }
    public DatePickerPage waitForLoad() {
        waitFor(validDaysBtns.get(0));
        return this;
    }
    @Description("This method clicks the nth day from today's date")
    public DatePickerPage clickDateByDays(int daysCount) {
        try{
            validDaysBtns.get(daysCount-1).click();
        } catch (Exception IndexOutOfBoundsException) {
            daysCount = daysCount - validDaysBtns.size() - ChosenDays.size();
            ForwardDatesBtn.click();

            waitForLoad();
            monthContainers.get(1).
                    findElements(validDaysBtnsLocator).
                    get(daysCount-1).click();
        }
        return this;
    }

    public void clickNextBtn() {
        nextBtn.click();
    }
}
