package yellowTailSite;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import yellowTailSite.pages.*;

import java.util.concurrent.TimeUnit;

public class yellowTail extends TestNgRunner {

    @Test(description = "Case 1: Welcome page: all required elements are displayed\n" + "1. Go to Welcome page: https://www.yellowtailwine.com\n" + "2. Verify that “I am of legal drinking age in” is displayed" + "3. Verify that checkbox before “I am of legal drinking age in” is displayed\n" + "4. Verify that dropdown with Select is displayed" + "5. Verify that “Welcome” button is displayed and is inactive")
    public void verifyAllRequiredElementsAreDisplayedOnWelcomePage() {
        WelcomePage welcomePage = new WelcomePage();
        Assert.assertTrue(welcomePage.getLegalAgeField().isDisplayed());
        Assert.assertTrue(welcomePage.getLegalAgeCheckbox().isDisplayed());
        Assert.assertTrue(welcomePage.getDropdownSelect().isEnabled());
        Assert.assertTrue(welcomePage.getWelcomeButton().isDisplayed());
        Assert.assertFalse(welcomePage.getWelcomeButton().isEnabled());
    }

    @Test(description = "Case 2: Welcome page: navigate to main page as European customer\n" + "1. Tick on checkbox\n" + "2. Select “Europe” from dropbox\n" + "3. Press “Welcome” button\n" + "4. Main page should be displayed")
    public void navigateToMainPageAsEuropeanCustomer() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage();
        MainPage mainPage = new MainPage();
        welcomePage.getLegalAgeCheckbox().click();
        Select dropdownSelect = new Select(welcomePage.getDropdownSelect());
        dropdownSelect.selectByValue("eu");
        welcomePage.clickOnWelcomeButton();
        Assert.assertTrue(mainPage.getWelcomeToTheWorld().isDisplayed());
    }

    @Test(description = "Case 3: Main page: all required elements are displayed" + "1. Navigate to main page" + "2. Verify that the following elements are displayed:" + "- menu button" + "- WELCOME TO THE WORLD OF [Yellow tail]\n" + "- We are passionate about creating great tasting, quality wines for everyone to" + "enjoy" + "- find your wine button" + "- footer\n")
    public void verifyAllRequiredElementsAreDisplayedOnMainPage() {
        WelcomePage welcomePage = new WelcomePage();
        MainPage mainPage = new MainPage();
        welcomePage.getLegalAgeCheckbox().click();
        Select dropdownSelect = new Select(welcomePage.getDropdownSelect());
        dropdownSelect.selectByValue("eu");
        welcomePage.clickOnWelcomeButton();
        Assert.assertTrue(mainPage.getMenuButton().isDisplayed());
        Assert.assertTrue(mainPage.getWelcomeToTheWorld().isDisplayed());
        Assert.assertTrue(mainPage.getTextWeArePassionate().isDisplayed());
        Assert.assertTrue(mainPage.getFindYourWineButton().isDisplayed());
        Assert.assertTrue(mainPage.getFooter().isDisplayed());


    }

    @Test(description = "Case 4: Main page: Menu button logic (open header)\n" + "1. Navigate to main page" + "2. Click on Menu button" + "3. Verify that header with all needed links is appeared")
    public void mainPageMenuButtonLogicOpenHeader() {
        WelcomePage welcomePage = new WelcomePage();
        MainPage mainPage = new MainPage();
        welcomePage.getLegalAgeCheckbox().click();
        Select dropdownSelect = new Select(welcomePage.getDropdownSelect());
        dropdownSelect.selectByValue("eu");
        welcomePage.clickOnWelcomeButton();
        mainPage.getMenuButton().click();
        HeaderElements headerElements = new HeaderElements();
        Assert.assertTrue(headerElements.getYellowTailLink().isEnabled());
        Assert.assertTrue(headerElements.getWinesLink().isEnabled());
        Assert.assertTrue(headerElements.getWhereToBuyLink().isEnabled());
        Assert.assertTrue(headerElements.getContactLink().isEnabled());
        Assert.assertTrue(headerElements.getOurStoryLink().isEnabled());
        Assert.assertTrue(headerElements.getFAQSLink().isEnabled());
        Assert.assertTrue(headerElements.getContactLink().isEnabled());
        Assert.assertTrue(headerElements.getGlobeDDL().isEnabled());
        Assert.assertTrue(headerElements.getRegionUS().isEnabled());
        Assert.assertTrue(headerElements.getRegionAU().isEnabled());
        Assert.assertTrue(headerElements.getRegionCN().isEnabled());
    }

    @Test(description = "Case 5: Main page: Menu button logic (close header)\n" + "1. Navigate to main page" + "2. Click on Menu button" + "3. Click on [yellow tail]" + "4. Verify that Menu button is visible")
    public void mainPageMenuButtonLogicCloseHeader() {
        WelcomePage welcomePage = new WelcomePage();
        MainPage mainPage = new MainPage();
        welcomePage.getLegalAgeCheckbox().click();
        Select dropdownSelect = new Select(welcomePage.getDropdownSelect());
        dropdownSelect.selectByValue("eu");
        welcomePage.clickOnWelcomeButton();
        mainPage.getMenuButton().click();
        HeaderElements headerElements = new HeaderElements();
        headerElements.getYellowTailLink().click();
        Assert.assertTrue(mainPage.getMenuButton().isDisplayed());
    }

    @Test(description = "Case 6: Main page: Global Nav logic\n" + "1. Navigate to main page" + "2. Click on Menu button" + "3. Click on Globe icon" + "4. Select China in popup and click on it" + "5. Verify that language is changed")
    public void mainPageGlobalNavLogic() {
        WelcomePage welcomePage = new WelcomePage();
        MainPage mainPage = new MainPage();
        welcomePage.getLegalAgeCheckbox().click();
        Select dropdownSelect = new Select(welcomePage.getDropdownSelect());
        dropdownSelect.selectByValue("eu");
        welcomePage.clickOnWelcomeButton();
        mainPage.getMenuButton().click();
        HeaderElements headerElements = new HeaderElements();
        headerElements.getGlobeDDL().click();
        headerElements.getRegionCN().click();
        //  Thread.sleep(1000);
        Assert.assertTrue(DriverProvider.INSTANCE.getDriver().getCurrentUrl().contains("cn"));
    }

    @Test(description = "Case 8: Where to buy: enter valid postal code\n" + "1. Navigate to “Where to buy” page" + "2. Enter valid data in “Your location” field" + "3. Click on Search button" + "4. Verify that the results of search are displayed")
    public void WhereToBuyEnterValidCostalCode() throws InterruptedException {
        WelcomePage welcomePage = new WelcomePage();
        MainPage mainPage = new MainPage();
        HeaderElements headerElements = new HeaderElements();
        WhereToBuyPage whereToBuyPage = new WhereToBuyPage();
        welcomePage.getLegalAgeCheckbox().click();
        Select dropdownSelect = new Select(welcomePage.getDropdownSelect());
        dropdownSelect.selectByValue("eu");
        welcomePage.clickOnWelcomeButton();
        mainPage.getMenuButton().click();
        headerElements.getWhereToBuyLink().click();
        whereToBuyPage.getMyLocation().click();
        Thread.sleep(1000);
        whereToBuyPage.getMyLocation().sendKeys("SYDNEY, NSW 2000");
        whereToBuyPage.getSearchButton().click();
        Thread.sleep(2000);
        Assert.assertTrue(whereToBuyPage.getStocksInYourArea().isDisplayed());
        Assert.assertTrue(whereToBuyPage.getAddressesAreDisplayed().isDisplayed());
    }

    @Test(description = "Case 9: Cocktails: Select one wine\n" + "1. Navigate to “Cocktails” page. 2.Select “Red wine cocktails”. 3. Verify that 7 recipes are displayed\n")
    public void selectOneWine() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.getLegalAgeCheckbox().click();
        Select dropdownSelect = new Select(welcomePage.getDropdownSelect());
        dropdownSelect.selectByValue("eu");
        welcomePage.clickOnWelcomeButton();
        MainPage mainPage = new MainPage();
        mainPage.getMenuButton().click();
        CocktailsPage cocktailsPage = new CocktailsPage();
        cocktailsPage.getCocktailsLink().click();
        cocktailsPage.getWineForCocktailsSelecting().click();
        cocktailsPage.getRedWineCocktails().click();
        Assert.assertEquals(cocktailsPage.getRedWineRecipes().size(), 9);
    }

    @Test(description = "Case 10: Cocktails: Navigate to Cocktail recipe page\n" + "1. Navigate to “Cocktails” page" + "2. Scroll to “RASPBERRY ROSÉ” recipe\n" + "3. Click on “RASPBERRY ROSÉ” recipe" + "4. Verify that new page is displayed: - ingredients section is displayed\n")
    public void ingredientsSectionIsDisplayed() {
        WelcomePage welcomePage = new WelcomePage();
        MainPage mainPage = new MainPage();
        CocktailsPage cocktailsPage = new CocktailsPage();
        RecipePage recipePage = new RecipePage();
        welcomePage.getLegalAgeCheckbox().click();
        Select dropdownSelect = new Select(welcomePage.getDropdownSelect());
        dropdownSelect.selectByValue("eu");
        welcomePage.clickOnWelcomeButton();
        mainPage.getMenuButton().click();
        cocktailsPage.getCocktailsLink().click();
        Actions actions = new Actions(DriverProvider.INSTANCE.getDriver());
        actions.moveToElement(cocktailsPage.getRaspberryRoseRecipe()).clickAndHold();
        actions.perform();
        cocktailsPage.getRaspberryRoseRecipe().click();
        Assert.assertTrue(recipePage.getRaspberryRoseTitle().isDisplayed());
        Assert.assertTrue(recipePage.getIngredientsSection().isDisplayed());

    }

    @Test(description = "Case 11: Cocktails: Select several wines\n" + "1. Navigate to “Cocktails” page. 2. Select “Red wine cocktails. 3. Select “Sparkling wine cocktails”\n" + "4. Verify that “Multiple” word is displayed in “Type” dropdown. 5. Verify that 18 recipes are displayed")
    public void severalWinesAresDisplayed() {
        WelcomePage welcomePage = new WelcomePage();
        welcomePage.getLegalAgeCheckbox().click();
        Select dropdownSelect = new Select(welcomePage.getDropdownSelect());
        dropdownSelect.selectByValue("eu");
        welcomePage.clickOnWelcomeButton();
        MainPage mainPage = new MainPage();
        mainPage.getMenuButton().click();
        CocktailsPage cocktailsPage = new CocktailsPage();
        cocktailsPage.getCocktailsLink().click();
        cocktailsPage.getWineForCocktailsSelecting().click();
        cocktailsPage.getRedWineCocktails().click();
        cocktailsPage.getSparklingWineCocktails().click();
        Assert.assertTrue(cocktailsPage.getMultipleSelect().isDisplayed());
        Assert.assertEquals(cocktailsPage.getRedWineRecipes().size(), 20);
    }
}
