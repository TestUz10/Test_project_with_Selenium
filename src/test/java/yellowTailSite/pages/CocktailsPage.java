package yellowTailSite.pages;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yellowTailSite.DriverProvider;

import java.util.List;

public class CocktailsPage {
    WebDriver driver;
    @FindBy(xpath = "//div[@class='inner']//span[text()='Cocktails']")
    private SelenideElement cocktailsLink;
    @FindBy(xpath = "//a[@class='selected']")
    private SelenideElement wineForCocktailsSelecting;
    @FindBy(xpath = "//*[@class='filter-options']/descendant::a[@data-value='red']")
    private SelenideElement redWineCocktails;
    @FindBy(xpath = "//div[@class='tile recipe-tile']")
    private ElementsCollection redWineRecipes;
    @FindBy(xpath = "//h2[contains(text(),'Raspberry Rosé')]")
    private SelenideElement raspberryRoseRecipe;
    @FindBy(xpath = "//*[@class='filter-options']/descendant::a[@data-value='bubbles']")
    private SelenideElement sparklingWineCocktails;
    @FindBy(xpath = "//div[@class='dropdown']//span[contains(text(),'Multiple')]")
    private SelenideElement multipleSelect;
    @FindBy(xpath = "//div[@class='tile recipe-tile']")
    private ElementsCollection wineRecipes;

//    public CocktailsPage() {
//        this.driver = DriverProvider.INSTANCE.getDriver();
//        PageFactory.initElements(driver, this);
//    }
    @Step
    public SelenideElement getCocktailsLink() {
        return cocktailsLink;
    }
    @Step
    public SelenideElement getWineForCocktailsSelecting() {
        return wineForCocktailsSelecting;
    }
    @Step
    public SelenideElement getRedWineCocktails() {
        return redWineCocktails;
    }
    @Step
    public ElementsCollection getRedWineRecipes() {
        return redWineRecipes;
    }
    @Step
    public SelenideElement getSparklingWineCocktails() {
        return sparklingWineCocktails;
    }
    @Step
    public SelenideElement getRaspberryRoseRecipe() {
        return raspberryRoseRecipe;
    }
    @Step
    public SelenideElement getMultipleSelect() {
        return multipleSelect;
    }
    @Step
    public ElementsCollection getWineRecipes() {
        return wineRecipes;
    }

}


