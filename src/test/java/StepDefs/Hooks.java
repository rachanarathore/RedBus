package StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.RedBus.Common.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp(){
        System.out.println("Launching Browser...");
        driver = WebDriverManager.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            System.out.println("Closing Browser...");
            WebDriverManager.quitDriver();
        }
    }
}
