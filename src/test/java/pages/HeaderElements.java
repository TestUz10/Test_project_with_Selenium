package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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


    public HeaderElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getYellowTailLink() {
        return yellowTailLink;
    }

    public WebElement getWinesLink() {
        return winesLink;
    }

    public WebElement getWhereToBuyLink() {
        return whereToBuyLink;
    }

    public WebElement getCocktailsLink() {
        return cocktailsLink;
    }

    public WebElement getOurStoryLink() {
        return ourStoryLink;
    }

    public WebElement getFAQSLink() {
        return FAQSLink;
    }

    public WebElement getContactLink() {
        return contactLink;
    }

    public WebElement getGlobeDDL() {
        return globeDDL;
    }

    public WebElement getRegionUS() {
        return regionUS;
    }

    public WebElement getRegionAU() {
        return regionAU;
    }

    public WebElement getRegionCN() {
        return regionCN;
    }
}
