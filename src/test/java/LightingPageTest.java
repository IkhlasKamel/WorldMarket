import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


public class LightingPageTest {
    BaseTest baseTest = new BaseTest();
    ChromeDriver driver;

    @BeforeClass
    public void setUp() {
        driver = baseTest.setUp("https://www.worldmarket.com/category/lighting.do");
    }

    @Test (priority = 1)
    public void verifyThatShopLightingOpensSuccessfully() {

        WebElement shopLighting= driver.findElement(By.xpath("//*[@id='ml-body-container']/main/div[3]/div/div[1]/div[2]/div[2]/div[6]/ul/li[1]/a"));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        assertTrue(shopLighting.isDisplayed());
    }


    @AfterClass
    public void tearDown(){
        baseTest.tearDown();
    }
}



