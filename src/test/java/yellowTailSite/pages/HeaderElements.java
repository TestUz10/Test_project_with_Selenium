package yellowTailSite.pages;

import com.codeborne.selenide.SelenideElement;
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
    private SelenideElement yellowTailLink;
    @FindBy(xpath = "//div[@class='inner']//span[text()='Wines']")
    private SelenideElement winesLink;
    @FindBy(xpath = "//div[@class='inner']//span[text()='Where To Buy']")
    private SelenideElement whereToBuyLink;
    @FindBy(xpath = "//div[@class='inner']//span[text()='Cocktails']")
    private SelenideElement cocktailsLink;
    @FindBy(xpath = "//div[@class='inner']//span[text()='Our Story']")
    private SelenideElement ourStoryLink;
    @FindBy(xpath = "//div[@class='inner']//span[text()='FAQs']")
    private SelenideElement FAQSLink;
    @FindBy(xpath = "//div[@class='inner']//span[text()='Contact']")
    private SelenideElement contactLink;
    @FindBy(xpath = "//li[@class='link country-select']//*[@class='fa fa-globe fa-lg']")
    private SelenideElement globeDDL;
    @FindBy(xpath = "//div[@class='top-nav -active']/descendant::a[@data-key='US']")
    private SelenideElement regionUS;
    @FindBy(xpath = "//div[@class='top-nav -active']/descendant::a[@data-key='AU']")
    private SelenideElement regionAU;
    @FindBy(xpath = "//div[@class='top-nav -active']/descendant::a[@data-key='CN']")
    private SelenideElement regionCN;


    public HeaderElements() {
        this.driver = DriverProvider.INSTANCE.getDriver();
        PageFactory.initElements(driver, this);
    }
    @Step
    public SelenideElement getYellowTailLink() {
        return yellowTailLink;
    }
    @Step
    public SelenideElement getWinesLink() {
        return winesLink;
    }
    @Step
    public SelenideElement getWhereToBuyLink() {
        return whereToBuyLink;
    }
    @Step
    public SelenideElement getCocktailsLink() {
        return cocktailsLink;
    }
    @Step
    public SelenideElement getOurStoryLink() {
        return ourStoryLink;
    }
    @Step
    public SelenideElement getFAQSLink() {
        return FAQSLink;
    }
    @Step
    public SelenideElement getContactLink() {
        return contactLink;
    }
    @Step
    public SelenideElement getGlobeDDL() {
        return globeDDL;
    }
    @Step
    public SelenideElement getRegionUS() {
        return regionUS;
    }
    @Step
    public SelenideElement getRegionAU() {
        return regionAU;
    }
    @Step
    public SelenideElement getRegionCN() {
        return regionCN;
    }
}
