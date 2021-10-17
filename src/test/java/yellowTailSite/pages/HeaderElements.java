package yellowTailSite.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import yellowTailSite.DriverProvider;

public class HeaderElements {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='top-nav -active']/descendant::img[@alt='Yellow tail logo']")
    private WebElement yellowTailLink;
    @FindBy(xpath = "//div[@class='inner']//span[text()='Wines']")
    private WebElement winesLink;
    @FindBy(xpath = "//div[@class='inner']//span[text()='Where To Buy']")
    private WebElement whereToBuyLink;
    @FindBy(xpath = "//div[@class='inner']//span[text()='Cocktails']")
    private WebElement cocktailsLink;
    @FindBy(xpath = "//div[@class='inner']//span[text()='Our Story']")
    private WebElement ourStoryLink;
    @FindBy(xpath = "//div[@class='inner']//span[text()='FAQs']")
    private WebElement FAQSLink;
    @FindBy(xpath = "//div[@class='inner']//span[text()='Contact']")
    private WebElement contactLink;
    @FindBy(xpath = "//li[@class='link country-select']//*[@class='fa fa-globe fa-lg']")
    private WebElement globeDDL;
    @FindBy(xpath = "//div[@class='top-nav -active']/descendant::a[@data-key='US']")
    private WebElement regionUS;
    @FindBy(xpath = "//div[@class='top-nav -active']/descendant::a[@data-key='AU']")
    private WebElement regionAU;
    @FindBy(xpath = "//div[@class='top-nav -active']/descendant::a[@data-key='CN']")
    private WebElement regionCN;


    public HeaderElements() {
        this.driver = DriverProvider.INSTANCE.getDriver();
        PageFactory.initElements(driver, this);
    }
    @Step
    public WebElement getYellowTailLink() {
        return yellowTailLink;
    }
    @Step
    public WebElement getWinesLink() {
        return winesLink;
    }
    @Step
    public WebElement getWhereToBuyLink() {
        return whereToBuyLink;
    }
    @Step
    public WebElement getCocktailsLink() {
        return cocktailsLink;
    }
    @Step
    public WebElement getOurStoryLink() {
        return ourStoryLink;
    }
    @Step
    public WebElement getFAQSLink() {
        return FAQSLink;
    }
    @Step
    public WebElement getContactLink() {
        return contactLink;
    }
    @Step
    public WebElement getGlobeDDL() {
        return globeDDL;
    }
    @Step
    public WebElement getRegionUS() {
        return regionUS;
    }
    @Step
    public WebElement getRegionAU() {
        return regionAU;
    }
    @Step
    public WebElement getRegionCN() {
        return regionCN;
    }
}
