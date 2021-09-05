import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FirstTest {
    public void navigateToFreeConsultationForm(){
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ithillel.ua/");
        //btn-consultation-hero // id
        By buttonFreeConsultationPath = By.id("btn-consultation-hero");
        WebElement buttonFreeConsultation  = driver.findElement(buttonFreeConsultationPath);
        buttonFreeConsultation.click();

        WebElement fieldNameConsultation = driver.findElement(By.id("input-name-consultation"));
        fieldNameConsultation.click();
        fieldNameConsultation.sendKeys("test");
        String inputValue = fieldNameConsultation.getAttribute("value");
        Assert.assertEquals(inputValue, "test");
        Assert.assertEquals(driver.getCurrentUrl(), "https://ithillel.ua/");

        driver.quit();
        System.out.println("Done");
    }


}
