package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.RedBus.Common.TestDataGenerator;
import org.RedBus.Common.WaitsToUse;
import org.RedBus.Pages.RailwaysBooking;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class searchTrains {
    WebDriver driver = Hooks.driver;
    WaitsToUse wait = new WaitsToUse(driver);
    RailwaysBooking railwaysBooking = new RailwaysBooking(driver);

    @Given("launch the browser with redbus")
    public void launchTheBrowserWithRedbus() {
        System.out.println("Browser launched");
        TestDataGenerator.printDataGenerated();
    }

    @Then("enter the {string} and {string} and {string}")
    public void enterTheAndAnd(String arg0, String arg1, String arg2) {
        wait.waitForClickable(railwaysBooking.fromCity());
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", railwaysBooking.getFrom());
        wait.waitForVisibility(railwaysBooking.getDateOfJourney());
        railwaysBooking.enterDoj(arg2);
    }

    @Then("click on search")
    public void clickOnSearch() {
        railwaysBooking.SearchTrains();
    }
}
