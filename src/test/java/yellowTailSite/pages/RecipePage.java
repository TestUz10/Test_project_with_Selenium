package yellowTailSite.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yellowTailSite.DriverProvider;

public class RecipePage {
    WebDriver driver;
    @FindBy(xpath = "//h1[@class='recipe-title']")
    private SelenideElement raspberryRoseTitle;
    @FindBy(xpath = "//div[@class='ingredients']")
    private SelenideElement ingredientsSection;

//    public RecipePage() {
//        this.driver = DriverProvider.INSTANCE.getDriver();
//        PageFactory.initElements(driver, this);
//    }
    @Step
    public SelenideElement getRaspberryRoseTitle() {
        return raspberryRoseTitle;
    }
    @Step
    public SelenideElement getIngredientsSection() {
        return ingredientsSection;
    }

}
