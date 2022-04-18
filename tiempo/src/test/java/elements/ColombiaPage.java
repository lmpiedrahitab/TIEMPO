package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ColombiaPage {

    WebDriver driver;

    @FindBy(xpath = "//li[@class='colombia first']")
    WebElement colombiaMenu;

    public ColombiaPage(WebDriver driver) {

        this.driver = driver;

        // This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    // Get Colombia in the menu
    public WebElement getColombiaMenu() {
        return colombiaMenu;
    }

}
