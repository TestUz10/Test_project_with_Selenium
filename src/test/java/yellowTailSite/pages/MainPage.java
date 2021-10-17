package yellowTailSite.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yellowTailSite.DriverProvider;

public class MainPage {
    WebDriver driver;
    @FindBy(xpath = "//span[text()='Menu']")
    private WebElement menuButton;
    @FindBy(xpath = "//div[@class='yt-logo']")
    private WebElement yellowTailButton;
    @FindBy(xpath = "//div[@class='content animation-screen -one']/h2")
    private WebElement welcomeToTheWorld;
    @FindBy(xpath = "//*[starts-with(text(), 'We are passionate')]")
    private WebElement textWeArePassionate;
    @FindBy(xpath = "//*[contains(text(), 'Find Your Wine')]")
    private WebElement findYourWineBtn;
    @FindBy(xpath = "//footer")
    private WebElement footer;

    public MainPage(){
        this.driver = DriverProvider.INSTANCE.getDriver();
        PageFactory.initElements(driver, this);
    }
    @Step
    public WebElement getMenuButton() {
        return menuButton;
    }
    @Step
    public WebElement getYellowTailButton(){
        return yellowTailButton;
    }
    @Step
    public WebElement getWelcomeToTheWorld() {
        return welcomeToTheWorld;
    }
    @Step
    public WebElement getTextWeArePassionate() {
        return textWeArePassionate;
    }
    @Step
    public WebElement getFindYourWineButton() {
        return findYourWineBtn;
    }
    @Step
    public WebElement getFooter() {
        return footer;
    }
//    public MenuBar clickOnMenuButton(){
//        getMenuButton().click();
//        return new MenuBar(driver);
}
