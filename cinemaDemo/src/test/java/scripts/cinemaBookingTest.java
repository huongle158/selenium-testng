package scripts;

import listeners.SimpleListeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;
import pages.PurchasePage;

import java.time.Duration;

@Listeners(SimpleListeners.class)
public class cinemaBookingTest extends BaseTest{

    @Test
    public void bookingTest() throws InterruptedException {

        Actions actions = new Actions(driver);

        LoginPage loginPage = new LoginPage(driver);
        PurchasePage purchasePage = new PurchasePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickSignInButton();
        logger.info("Start logging");
        loginPage.login("huydao226", "asdEDZ12#");

        logger.info("Login success");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='homeTool']"))));

//        Thread.sleep(10000);
        WebElement homeTool = driver.findElement(By.xpath("//div[@id='homeTool']"));
        actions.scrollToElement(homeTool);
        logger.info("Next step");
        WebElement filmPlayButton = driver
                .findElement(By.xpath("//div[@id='lichChieu']//button[contains(@class,'MuiFab-root')]"));
        actions.moveToElement(filmPlayButton).perform();
        WebElement bookTicket = driver.findElement(By.xpath("//a[@class =\"jss294\" and contains(.,'MUA VÉ')]"));
        bookTicket.click();

        // Chọn Thời gian
        WebElement bookTime = driver.findElement(By.xpath("(//a[contains(@href, '/purchase/')])[1]"));
        bookTime.click();
        logger.info("Done");

//        purchasePage.purchaseSlot("12");
//        profilePage.verifyBookingPrice("130000", "55");
    }
}
