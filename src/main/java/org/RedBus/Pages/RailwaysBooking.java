package org.RedBus.Pages;

import io.cucumber.java.de.Wenn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RailwaysBooking {
    WebDriver driver;

    public WebElement getFrom() {
        return From;
    }

    public void setFrom(WebElement From) {
        this.From = From;
    }

    public By fromCity(){
        return By.xpath("//div[contains(@class,'srcDestWrapper')]//div[text()='From']");
    }

    @FindBy(xpath = "//div[contains(@class,'srcDestWrapper')]//div[text()='From']")
    private WebElement From;

    @FindBy(xpath = "//div[contains(text(),'From')]/following-sibling::div")
    private WebElement sourceCity;

    @FindBy(xpath = "//div[texsst()='To']")
    private WebElement destinationCity;

    @FindBy(className = "doj___a25ae7")
    private WebElement dateOfJourney;

    public WebElement getEnterSrcVal() {
        return enterSrcVal;
    }

    public void clickSrcVal(){
        enterSrcVal.click();
    }

    public void setEnterSrcVal(String val) {
        enterSrcVal.sendKeys(val);
    }

    @FindBy(xpath = "//div[contains(@class,'searchCategory')]//span[contains(@class,'metaData') and contains(text(),'YPR')]")
    private WebElement enterSrcVal;

    public By getSourceCity() {
        return By.xpath("//div[contains(@class,'srcDestWrapper')]//div[text()='From']/following-sibling::div");
    }

    public By getDestinationCity() {
        return By.xpath("//div[text()='To']");
    }

    public WebElement sourceCity() {
        return sourceCity;
    }

    public WebElement DestinationCity() {
        return destinationCity;
    }
    public By getDateOfJourney() {
        return By.className("doj___a25ae7");
    }

    public WebElement getSearchTrains() {
        return searchTrains;
    }



    public void SearchTrains() {
        searchTrains.click();
    }

    @FindBy(xpath = "//*[text()='Search Trains']//parent::button")
    private WebElement searchTrains;

    public void enterSourceCity(String source) {
        sourceCity.sendKeys(source);
    }

    public void enterDestCity(String destination) {
        destinationCity.sendKeys(destination);
    }

    public void clickElement(WebElement element){
        element.click();
    }

    public void enterDoj(String DOJ) {
        dateOfJourney.sendKeys(DOJ);
    }

    public RailwaysBooking(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
