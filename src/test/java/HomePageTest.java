
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class HomePageTest {
    BaseTest baseTest= new BaseTest();
    ChromeDriver driver;
    @BeforeClass

    public void setUp(){
        driver=  baseTest.setUp("https://www.worldmarket.com");}



    @Test (priority = 2)
    public void verifyThatFurnitureButtonIsDisplayed() {
        WebElement furnitureButton = driver.findElement(By.id("ml-accessible-megamenu-furniture-1"));
        assertTrue(furnitureButton.isDisplayed());
    }
    @Test(priority = 3)

    public void verifyThatClickingJoinButtonOpensTheHome() {
        WebElement joinButton = driver.findElement(By.id("gpsnonjoin"));
        BaseTest.chromeDriver.manage().deleteAllCookies();
        joinButton.click();
}


    @AfterClass
    public void tearDown(){
        baseTest.tearDown();
    }
}
