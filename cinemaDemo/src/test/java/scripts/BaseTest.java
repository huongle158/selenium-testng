package scripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;

    static Logger logger = LogManager.getLogger("testBookingFromHomePage");


    @BeforeMethod
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        Set up thoi gian cho ngam, ko can dung Thread.sleep nua
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demo1.cybersoft.edu.vn/");

    }

    public WebDriver getDriver(){
        return driver;
    }

}
