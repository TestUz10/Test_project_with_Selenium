package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getMenuButton() {
        return menuButton;
    }
    public WebElement getYellowTailButton(){
        return yellowTailButton;
    }

    public WebElement getWelcomeToTheWorld() {
        return welcomeToTheWorld;
    }

    public WebElement getTextWeArePassionate() {
        return textWeArePassionate;
    }

    public WebElement getFindYourWineButton() {
        return findYourWineBtn;
    }

    public WebElement getFooter() {
        return footer;
    }
//    public MenuBar clickOnMenuButton(){
//        getMenuButton().click();
//        return new MenuBar(driver);
}
