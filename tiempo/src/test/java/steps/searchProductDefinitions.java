package steps;

import elements.HomePage;
import elements.ColombiaPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class searchProductDefinitions {

    WebDriver driver;

    ColombiaPage objSearch;

    HomePage objHomePage;

    @Before
    public void setup() {

        // Initialize the webdriver and open the browser
        //System.setProperty("webdriver.gecko.driver", driverPath);
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Given("the user visits the El Tiempo website")
    public void the_user_visits_the_el_tiempo_website() {
        // open Tiempo page
        driver.get("https://www.eltiempo.com");

    }

    @When("the user clicks on the Colombia option")
    public void the_user_clicks_on_the_colombia_option() {
        // go the next page
        objHomePage = new HomePage(driver);
        objHomePage.clickColombia();
    }

    @Then("the Colombia page should load")
    public void the_colombia_page_should_load() {
        /// Verify Colombia page
        objSearch = new ColombiaPage(driver);
        Assert.assertEquals("COLOMBIA",objSearch.getColombiaMenu().getText());
    }

    @After
    public void close() {

        // Close the browser
        driver.close();
    }
}
