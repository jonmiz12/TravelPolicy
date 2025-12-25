package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import pageobjects.DatePickerPage;
import pageobjects.DestinationsPage;
import pageobjects.PassengersPage;
import pageobjects.TravelPolicyPage;

public class BaseTest {
    WebDriver driver;
    TravelPolicyPage TravelPolicyPage;
    DestinationsPage DestinationPage;
    DatePickerPage DatePickerPage;
    PassengersPage PassengersPage;

    String url = "https://digital.harel-group.co.il/travel-policy";

    public void initializePageobjects(){
        TravelPolicyPage = new TravelPolicyPage(driver);
        DestinationPage = new DestinationsPage(driver);
        DatePickerPage = new DatePickerPage(driver);
        PassengersPage = new PassengersPage(driver);
    }
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        initializePageobjects();
    }
}
