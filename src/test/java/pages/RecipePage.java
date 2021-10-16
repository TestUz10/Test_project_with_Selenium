package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecipePage {
    WebDriver driver;
    @FindBy(xpath = "//h1[@class='recipe-title']")
    private WebElement raspberryRoseTitle;
    @FindBy(xpath = "//div[@class='ingredients']")
    private WebElement ingredientsSection;

    public RecipePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getRaspberryRoseTitle() {
        return raspberryRoseTitle;
    }

    public WebElement getIngredientsSection() {
        return ingredientsSection;
    }

}
