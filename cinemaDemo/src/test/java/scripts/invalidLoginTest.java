package scripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class invalidLoginTest {

        @Test
    public static void verifyInvalidLogin() {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            driver.get("https://demo1.cybersoft.edu.vn/");

            HomePage homePage = new HomePage(driver);
            LoginPage loginPage = new LoginPage(driver);

            homePage.clickSignInButton();
            //Nhập username
            //click login button
            loginPage.login("huydao226","");

            loginPage.inputUsername("huydao226");
            loginPage.inputPassword("sajdhaksjhd");

            //Verify if there is error message displays
            loginPage.verifyErrorMessageIsDisplay();
    }
}
