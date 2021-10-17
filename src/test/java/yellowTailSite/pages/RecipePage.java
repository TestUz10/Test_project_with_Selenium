package yellowTailSite.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yellowTailSite.DriverProvider;

public class RecipePage {
    WebDriver driver;
    @FindBy(xpath = "//h1[@class='recipe-title']")
    private WebElement raspberryRoseTitle;
    @FindBy(xpath = "//div[@class='ingredients']")
    private WebElement ingredientsSection;

    public RecipePage() {
        this.driver = DriverProvider.INSTANCE.getDriver();
        PageFactory.initElements(driver, this);
    }
    @Step
    public WebElement getRaspberryRoseTitle() {
        return raspberryRoseTitle;
    }
    @Step
    public WebElement getIngredientsSection() {
        return ingredientsSection;
    }

}
