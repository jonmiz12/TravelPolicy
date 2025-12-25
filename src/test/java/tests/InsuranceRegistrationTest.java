package tests;
import org.testng.annotations.Test;

public class InsuranceRegistrationTest extends BaseTest{
    @Test
    public void tc01_Register(){
        TravelPolicyPage.waitForLoad().clickFirstTimePurchase();
        DestinationPage.waitForLoad().clickAsia().clickMoveToDatePicker();
        DatePickerPage.waitForLoad().clickDateByDays(7).clickDateByDays(37).clickNextBtn();
        assert (PassengersPage.isPassengersPageOpened());
    }
}
