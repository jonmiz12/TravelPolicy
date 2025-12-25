package tests;
//import io.qameta.allure.
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class InsuranceRegistrationTest extends BaseTest{
    @Test
    @Description("This test validates the registration of insurance policies")
    public void tc01_Register(){
        TravelPolicyPage.waitForLoad().clickFirstTimePurchase();
        DestinationPage.waitForLoad().clickAsia().clickMoveToDatePicker();
        DatePickerPage.waitForLoad().clickDateByDays(7).clickDateByDays(37).clickNextBtn();
        assert (PassengersPage.isPassengersPageOpened());
    }
}