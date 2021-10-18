package yellowTailSite.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import yellowTailSite.DriverProvider;

public class MainPage {
    WebDriver driver;
    @FindBy(xpath = "//span[text()='Menu']")
    private SelenideElement menuButton;
    @FindBy(xpath = "//div[@class='yt-logo']")
    private SelenideElement yellowTailButton;
    @FindBy(xpath = "//div[@class='content animation-screen -one']/h2")
    private SelenideElement welcomeToTheWorld;
    @FindBy(xpath = "//*[starts-with(text(), 'We are passionate')]")
    private SelenideElement textWeArePassionate;
    @FindBy(xpath = "//*[contains(text(), 'Find Your Wine')]")
    private SelenideElement findYourWineBtn;
    @FindBy(xpath = "//footer")
    private SelenideElement footer;

    //
//    public MainPage(){
//        this.driver = DriverProvider.INSTANCE.getDriver();
//        PageFactory.initElements(driver, this);
//    }
    @Step
    public SelenideElement getMenuButton() {
        return menuButton;
    }

    @Step
    public SelenideElement getYellowTailButton() {
        return yellowTailButton;
    }

    @Step
    public SelenideElement getWelcomeToTheWorld() {
        return welcomeToTheWorld;
    }

    @Step
    public SelenideElement getTextWeArePassionate() {
        return textWeArePassionate;
    }

    @Step
    public SelenideElement getFindYourWineButton() {
        return findYourWineBtn;
    }

    @Step
    public SelenideElement getFooter() {
        return footer;
    }

    public HeaderElements clickOnMenuButton() {
        getMenuButton().click();
        return new HeaderElements();
    }
}
