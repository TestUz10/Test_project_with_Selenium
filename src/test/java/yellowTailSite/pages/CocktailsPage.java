package yellowTailSite.pages;

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
    private WebElement cocktailsLink;
    @FindBy(xpath = "//a[@class='selected']")
    private WebElement wineForCocktailsSelecting;
    @FindBy(xpath = "//*[@class='filter-options']/descendant::a[@data-value='red']")
    private WebElement redWineCocktails;
    @FindBy(xpath = "//div[@class='tile recipe-tile']")
    private List<WebElement> redWineRecipes;
    @FindBy(xpath = "//h2[contains(text(),'Raspberry Rosé')]")
    private WebElement raspberryRoseRecipe;
    @FindBy(xpath = "//*[@class='filter-options']/descendant::a[@data-value='bubbles']")
    private WebElement sparklingWineCocktails;
    @FindBy(xpath = "//div[@class='dropdown']//span[contains(text(),'Multiple')]")
    private WebElement multipleSelect;
    @FindBy(xpath = "//div[@class='tile recipe-tile']")
    private List<WebElement> wineRecipes;

    public CocktailsPage() {
        this.driver = DriverProvider.INSTANCE.getDriver();
        PageFactory.initElements(driver, this);
    }
    @Step
    public WebElement getCocktailsLink() {
        return cocktailsLink;
    }
    @Step
    public WebElement getWineForCocktailsSelecting() {
        return wineForCocktailsSelecting;
    }
    @Step
    public WebElement getRedWineCocktails() {
        return redWineCocktails;
    }
    @Step
    public List<WebElement> getRedWineRecipes() {
        return redWineRecipes;
    }
    @Step
    public WebElement getSparklingWineCocktails() {
        return sparklingWineCocktails;
    }
    @Step
    public WebElement getRaspberryRoseRecipe() {
        return raspberryRoseRecipe;
    }
    @Step
    public WebElement getMultipleSelect() {
        return multipleSelect;
    }
    @Step
    public List<WebElement> getWineRecipes() {
        return wineRecipes;
    }

}


