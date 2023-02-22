
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.assertTrue;

public class JoinNowPageTest {
    BaseTest baseTest= new BaseTest();
    ChromeDriver driver;
    @BeforeClass
    public void setUp(){
        driver=  baseTest.setUp("https://www.worldmarket.com/");}
    @Test(priority = 1)
    public void verifyJoinNowPageTestistIsDisplayed(){

        WebElement joinAsSpecialistButton= driver.findElement(By.xpath("//*[@id='gpsnonjoin']"));
        Assert.assertTrue(joinAsSpecialistButton.isDisplayed());
    }
    @Test(priority = 2)
    public void verifyClickingJoinNowPageTestIstOpensTheForm(){

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='Join Now']")));
        WebElement joinAsSpecialistButton= driver.findElement(By.xpath("//*[@id='gpsnonjoin']"));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        BaseTest.chromeDriver.manage().window().maximize();
        joinAsSpecialistButton.click();
        WebElement joinUsForm = driver.findElement(By.id("gpsnonjoin"));
        Assert.assertTrue(joinUsForm.isDisplayed());
    }
}
