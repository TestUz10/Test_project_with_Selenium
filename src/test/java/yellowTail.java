import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class yellowTail {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.yellowtailwine.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test(description = "Case 1: Welcome page: all required elements are displayed\n" + "1. Go to Welcome page: https://www.yellowtailwine.com\n" +
            "2. Verify that “I am of legal drinking age in” is displayed" + "3. Verify that checkbox before “I am of legal drinking age in” is displayed\n" +
            "4. Verify that dropdown with Select is displayed" + "5. Verify that “Welcome” button is displayed and is inactive")
    public void verifyAllRequiredElementsAreDisplayedOnWelcomePage() throws InterruptedException {
        Thread.sleep(1000);
        WebElement ageOfUser = driver.findElement(By.xpath("//label[text()='I am of legal drinking age in']"));
        Assert.assertTrue(ageOfUser.isDisplayed());
        WebElement checkbox = driver.findElement(By.xpath("//div[@class='confirmation-checkbox']/child::label"));
        Assert.assertTrue(checkbox.isDisplayed());
        WebElement dropDownExists = driver.findElement(By.id("agegate-selector-options"));
        Assert.assertTrue(dropDownExists.isDisplayed());
        WebElement welcomeButton = driver.findElement(By.xpath("//input[@type='submit']"));
        Assert.assertTrue(welcomeButton.isDisplayed());
        Assert.assertFalse(welcomeButton.isEnabled());
    }

    @Test(description = "Case 2: Welcome page: navigate to main page as European customer\n" +
            "1. Tick on checkbox\n" + "2. Select “Europe” from dropbox\n" + "3. Press “Welcome” button\n" + "4. Main page should be displayed")
    public void navigateToMainPageAsEuropeanCustomer() throws InterruptedException {
        Thread.sleep(1000);
        WebElement legalDrinkingAgeCheckbox = driver.findElement(By.xpath("//div[@class='confirmation-checkbox']"));
        legalDrinkingAgeCheckbox.click();
        Select dropdown = new Select(driver.findElement(By.id("agegate-selector-options")));
        dropdown.selectByVisibleText("Europe");
        WebElement welcomeButton = driver.findElement(By.xpath("//input[@type='submit']"));
        welcomeButton.click();
        WebElement mainPageIsDisplayed = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]"));
        Assert.assertTrue(mainPageIsDisplayed.isDisplayed());

    }

    @Test(description = "Case 3: Main page: all required elements are displayed" +
            "1. Navigate to main page" + "2. Verify that the following elements are displayed:" + "- menu button" + "- WELCOME TO THE WORLD OF [Yellow tail]\n" +
            "- We are passionate about creating great tasting, quality wines for everyone to" + "enjoy" + "- find your wine button" + "- footer\n")
    public void verifyAllRequiredElementsAreDisplayedOnminPage() throws InterruptedException {
        Thread.sleep(1000);
        WebElement legalDrinkingAgeCheckbox = driver.findElement(By.xpath("//div[@class='confirmation-checkbox']"));
        legalDrinkingAgeCheckbox.click();
        Select dropdown = new Select(driver.findElement(By.id("agegate-selector-options")));
        dropdown.selectByValue("eu");
        WebElement welcomeButton = driver.findElement(By.xpath("//input[@type='submit']"));
        welcomeButton.click();
        WebElement menu = driver.findElement(By.xpath("//span[text()='Menu']"));
        Assert.assertTrue(menu.isDisplayed());
        WebElement welcomeToTheWorldPart1 = driver.findElement(By.xpath("//span[contains(text(),'Welcome')]"));
        Assert.assertTrue(welcomeToTheWorldPart1.isDisplayed());
        WebElement welcomeToTheWorldPart2 = driver.findElement(By.xpath("//*[contains(text(), 'to the world of')]"));
        Assert.assertTrue(welcomeToTheWorldPart2.isDisplayed());
        WebElement textWeArePassionate = driver.findElement(By.xpath("//*[starts-with(text(), 'We are passionate')]"));
        Assert.assertTrue(textWeArePassionate.isDisplayed());
        WebElement findYourWineBtn = driver.findElement(By.xpath("//*[contains(text(), 'Find Your Wine')]"));
        Assert.assertTrue(findYourWineBtn.isDisplayed());
        WebElement footer = driver.findElement(By.id("primary-footer"));
        Assert.assertTrue(footer.isDisplayed());
    }

    @Test(description = "Case 4: Main page: Menu button logic (open header)\n" +
            "1. Navigate to main page" + "2. Click on Menu button" + "3. Verify that header with all needed links is appeared")
    public void mainPageMenuButtonLogicOpenHeader() throws InterruptedException {
        Thread.sleep(1000);
        WebElement legalDrinkingAgeCheckbox = driver.findElement(By.xpath("//div[@class='confirmation-checkbox']"));
        legalDrinkingAgeCheckbox.click();
        Select dropdown = new Select(driver.findElement(By.id("agegate-selector-options")));
        dropdown.selectByValue("eu");
        WebElement welcomeButton = driver.findElement(By.xpath("//input[@type='submit']"));
        welcomeButton.click();
        WebElement menu = driver.findElement(By.xpath("//span[text()='Menu']"));
        Assert.assertTrue(menu.isDisplayed());
        WebElement menuButton = driver.findElement(By.xpath("//div[@class='main-nav']/descendant::i"));
        menuButton.click();
        WebElement header = driver.findElement(By.xpath("//div[@class='default-nav']"));
        Assert.assertTrue(header.isDisplayed());
        WebElement yellowTailLink = driver.findElement(By.xpath("//div[@class='top-nav -active']/descendant::img[@alt='Yellow tail logo']"));
        yellowTailLink.isDisplayed();
        WebElement winesLink = driver.findElement(By.xpath("//div[@class='inner']//span[text()='Wines']"));
        winesLink.isDisplayed();
        WebElement whereToBuyLink = driver.findElement(By.xpath("//div[@class='inner']//span[text()='Where To Buy']"));
        whereToBuyLink.isDisplayed();
        WebElement cocktailsLink = driver.findElement(By.xpath("//div[@class='inner']//span[text()='Cocktails']"));
        cocktailsLink.isDisplayed();
        WebElement ourStoryLink = driver.findElement(By.xpath("//div[@class='inner']//span[text()='Our Story']"));
        ourStoryLink.isDisplayed();
        WebElement faqsLink = driver.findElement(By.xpath("//div[@class='inner']//span[text()='FAQs']"));
        faqsLink.isDisplayed();
        WebElement contactLink = driver.findElement(By.xpath("//div[@class='inner']//span[text()='Contact']"));
        contactLink.isDisplayed();
        driver.findElement(By.xpath("//li[@class='link country-select']//*[@class='fa fa-globe fa-lg']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='top-nav -active']/descendant::a[@data-key='US']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='top-nav -active']/descendant::a[@data-key='AU']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='top-nav -active']/descendant::a[@data-key='CN']")).isDisplayed());
    }

    @Test(description = "Case 5: Main page: Menu button logic (close header)\n" +
            "1. Navigate to main page" + "2. Click on Menu button" + "3. Click on [yellow tail]" + "4. Verify that Menu button is visible")
    public void mainPageMenuButtonLogicCloseHeader() throws InterruptedException {
        Thread.sleep(1000);
        WebElement legalDrinkingAgeCheckbox = driver.findElement(By.xpath("//div[@class='confirmation-checkbox']"));
        legalDrinkingAgeCheckbox.click();
        Select dropdown = new Select(driver.findElement(By.id("agegate-selector-options")));
        dropdown.selectByValue("eu");
        WebElement welcomeButton = driver.findElement(By.xpath("//input[@type='submit']"));
        welcomeButton.click();
        WebElement menuButton = driver.findElement(By.xpath("//*[@class='fa fa-bars']"));
        menuButton.click();
        WebElement yellowTailClicking = driver.findElement(By.xpath("//div[@class='top-nav -active']/descendant::a"));
        yellowTailClicking.isDisplayed();
        Thread.sleep(1000);
        yellowTailClicking.click();
        Thread.sleep(1000);
        WebElement menu = driver.findElement(By.xpath("//span[text()='Menu']"));
        Assert.assertTrue(menu.isDisplayed());
    }

    @Test(description = "Case 6: Main page: Global Nav logic\n" +
            "1. Navigate to main page" + "2. Click on Menu button" + "3. Click on Globe icon" + "4. Select China in popup and click on it" + "5. Verify that language is changed")
    public void mainPageGlobalNavLogic() throws InterruptedException {
        Thread.sleep(1000);
        WebElement legalDrinkingAgeCheckbox = driver.findElement(By.xpath("//div[@class='confirmation-checkbox']"));
        legalDrinkingAgeCheckbox.click();
        Select dropdown = new Select(driver.findElement(By.id("agegate-selector-options")));
        dropdown.selectByValue("eu");
        WebElement welcomeButton = driver.findElement(By.xpath("//input[@type='submit']"));
        welcomeButton.click();
        WebElement menuButton = driver.findElement(By.xpath("//div[@class='main-nav']/descendant::i"));
        menuButton.click();
        WebElement globe = driver.findElement(By.xpath("//ul/descendant::li[@class='link country-select']//*[@class='fa fa-globe fa-lg']"));
        //  WebElement globe = driver.findElement(By.xpath("//ul/descendant::li[@class='link country-select']//a"));
        globe.isDisplayed();
        globe.isSelected();
        WebElement chooseChina = driver.findElement(By.xpath("//div[@class='top-nav -active']/descendant::a[@data-key='CN']"));
        chooseChina.isSelected();
        Assert.assertTrue(chooseChina.isDisplayed());
    }


    @Test(description = "Case 8: Where to buy: enter valid postal code\n" +
            "1. Navigate to “Where to buy” page" + "2. Enter valid data in “Your location” field" + "3. Click on Search button" + "4. Verify that the results of search are displayed")
    public void WhereToBuyEnterValidCostalCode() throws InterruptedException {
        Thread.sleep(1000);
        WebElement legalDrinkingAgeCheckbox = driver.findElement(By.xpath("//div[@class='confirmation-checkbox']"));
        legalDrinkingAgeCheckbox.click();
        Select dropdown = new Select(driver.findElement(By.id("agegate-selector-options")));
        dropdown.selectByValue("eu");
        WebElement welcomeButton = driver.findElement(By.xpath("//input[@type='submit']"));
        welcomeButton.click();
        WebElement menuButton = driver.findElement(By.xpath("//div[@class='main-nav']/descendant::i"));
        menuButton.click();
        Thread.sleep(1000);
        WebElement whereToBuyLink = driver.findElement(By.xpath("//div[@class='inner']//span[text()='Where To Buy']"));
        whereToBuyLink.click();
        WebElement locationField = driver.findElement(By.xpath("//a[text()='Where to Buy']"));
        locationField.click(); //a[text()='Enter City or ZIP']
        WebElement myLocation = driver.findElement(By.id("locationName"));
        myLocation.sendKeys("SYDNEY, NSW 2000");
        WebElement searchButtonClick = driver.findElement(By.className("search-submit"));
        searchButtonClick.click();
        Thread.sleep(2000);
        WebElement stocksInYourAreaDisplayed = driver.findElement(By.xpath("//h3[text()='Stockists in your area:']"));
        Assert.assertTrue(stocksInYourAreaDisplayed.isDisplayed());
        WebElement addressesAreDisplayed = driver.findElement(By.xpath("//div[@class='tiles']/descendant::div[@class='tile']"));
        Assert.assertTrue(addressesAreDisplayed.isEnabled());
    }

    @Test(description = "Case 9: Cocktails: Select one wine\n" +
            "1. Navigate to “Cocktails” page. 2.Select “Red wine cocktails”. 3. Verify that 7 recipes are displayed\n")
    public void selectOneWine() throws InterruptedException {
        Thread.sleep(1000);
        WebElement legalDrinkingAgeCheckbox = driver.findElement(By.xpath("//div[@class='confirmation-checkbox']"));
        legalDrinkingAgeCheckbox.click();
        Select dropdown = new Select(driver.findElement(By.id("agegate-selector-options")));
        dropdown.selectByValue("eu");
        WebElement welcomeButton = driver.findElement(By.xpath("//input[@type='submit']"));
        welcomeButton.click();
        WebElement menu = driver.findElement(By.xpath("//span[text()='Menu']"));
        Assert.assertTrue(menu.isDisplayed());
        WebElement menuButton = driver.findElement(By.xpath("//div[@class='main-nav']/descendant::i"));
        menuButton.click();
        WebElement cocktailsLink = driver.findElement(By.xpath("//div[@class='inner']//span[text()='Cocktails']"));
        cocktailsLink.click();
        WebElement wineForCocktailsSelecting = driver.findElement(By.xpath("//a[@class='selected']"));
        wineForCocktailsSelecting.click();
        WebElement redWineCocktails = driver.findElement(By.xpath("//*[@class='filter-options']/descendant::a[@data-value='red']"));
        redWineCocktails.click();
        List<WebElement> redWineRecipesAreDisplayed = driver.findElements(By.xpath("//div[@class='tile recipe-tile']"));
        Assert.assertTrue(redWineRecipesAreDisplayed.size() >= 7);
    }

    @Test(description = "Case 10: Cocktails: Navigate to Cocktail recipe page\n" +
            "1. Navigate to “Cocktails” page" + "2. Scroll to “RASPBERRY ROSÉ” recipe\n" +
            "3. Click on “RASPBERRY ROSÉ” recipe" + "4. Verify that new page is displayed: - ingredients section is displayed\n")
    public void ingredientsSectionIsDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        WebElement legalDrinkingAgeCheckbox = driver.findElement(By.xpath("//div[@class='confirmation-checkbox']"));
        legalDrinkingAgeCheckbox.click();
        Select dropdown = new Select(driver.findElement(By.id("agegate-selector-options")));
        dropdown.selectByValue("eu");
        WebElement welcomeButton = driver.findElement(By.xpath("//input[@type='submit']"));
        welcomeButton.click();
        WebElement menu = driver.findElement(By.xpath("//span[text()='Menu']"));
        Assert.assertTrue(menu.isDisplayed());
        WebElement menuButton = driver.findElement(By.xpath("//div[@class='main-nav']/descendant::i"));
        menuButton.click();
        WebElement cocktailsLink = driver.findElement(By.xpath("//div[@class='inner']//span[text()='Cocktails']"));
        cocktailsLink.click();
        Thread.sleep(2000);
        WebElement raspberryRoseRecipe = driver.findElement(By.xpath("//h2[contains(text(),'Raspberry Rosé')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(raspberryRoseRecipe);
        actions.perform();
        raspberryRoseRecipe.click();
        WebElement raspberryRoseTitleIsDisplayed = driver.findElement(By.xpath("//h1[@class='recipe-title']"));
        Assert.assertTrue(raspberryRoseTitleIsDisplayed.isDisplayed());
        WebElement ingredientsSectionIsDisplayed = driver.findElement(By.xpath("//div[@class='ingredients']"));
        Assert.assertTrue(ingredientsSectionIsDisplayed.isDisplayed());
    }

    @Test(description =
            "Case 11: Cocktails: Select several wines\n" +
                    "1. Navigate to “Cocktails” page. 2. Select “Red wine cocktails. 3. Select “Sparkling wine cocktails”\n" +
                    "4. Verify that “Multiple” word is displayed in “Type” dropdown. 5. Verify that 18 recipes are displayed")
    public void severalWinesAresDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        WebElement legalDrinkingAgeCheckbox = driver.findElement(By.xpath("//div[@class='confirmation-checkbox']"));
        legalDrinkingAgeCheckbox.click();
        Select dropdown = new Select(driver.findElement(By.id("agegate-selector-options")));
        dropdown.selectByValue("eu");
        WebElement welcomeButton = driver.findElement(By.xpath("//input[@type='submit']"));
        welcomeButton.click();
        WebElement menu = driver.findElement(By.xpath("//span[text()='Menu']"));
        Assert.assertTrue(menu.isDisplayed());
        WebElement menuButton = driver.findElement(By.xpath("//div[@class='main-nav']/descendant::i"));
        menuButton.click();
        WebElement cocktailsLink = driver.findElement(By.xpath("//div[@class='inner']//span[text()='Cocktails']"));
        cocktailsLink.click();
        Thread.sleep(2000);
        WebElement wineForCocktailsSelecting = driver.findElement(By.xpath("//a[@class='selected']"));
        wineForCocktailsSelecting.click();
        Thread.sleep(2000);
        WebElement redWineCocktails = driver.findElement(By.xpath("//*[@class='filter-options']/descendant::a[@data-value='red']"));
        redWineCocktails.click();
        WebElement sparklingWineCocktails = driver.findElement(By.xpath("//*[@class='filter-options']/descendant::a[@data-value='bubbles']"));
        sparklingWineCocktails.click();
        WebElement multipleSelecting = driver.findElement(By.xpath("//div[@class='dropdown']//span[contains(text(),'Multiple')]"));
        Assert.assertTrue(multipleSelecting.isDisplayed());
        List<WebElement> wineRecipesAreDisplayed = driver.findElements(By.xpath("//div[@class='tile recipe-tile']"));
        Assert.assertTrue(wineRecipesAreDisplayed.size() >= 18);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
