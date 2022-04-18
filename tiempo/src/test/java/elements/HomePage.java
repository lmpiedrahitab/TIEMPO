package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(className = "colombia")
    WebElement colombiaOption;

    public HomePage(WebDriver driver) {
        this.driver = driver;

        // This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    // Click on Colombia option from Home Page
    public void clickColombia() {
        colombiaOption.click();
    }

}
