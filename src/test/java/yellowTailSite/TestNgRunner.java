package yellowTailSite;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static yellowTailSite.Constants.URL_YELLOW_TAIL;
public class TestNgRunner {
    WebDriver driver;
    @BeforeMethod
    public void beforeTest() {
       // driver = new ChromeDriver();
        DriverProvider.INSTANCE.getDriver().get(URL_YELLOW_TAIL);
    }
    @AfterMethod (alwaysRun = true)
    public void afterTest(ITestResult result) {
        if (!result.isSuccess()){
            //makeScreenshot();
        }
        DriverProvider.INSTANCE.removeDriver();
    }
    @Attachment(value = "Page screenshot", type = "img/png")
    public byte[] makeScreenshot(){
        return ((TakesScreenshot) DriverProvider.INSTANCE.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
