package pangiamHomePage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.util.List;


public class PangiamHomePageTest {
    WebDriver driver;
    WebElement element;
    Actions actions;




    @Test
    public void UserLaunchWebPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
//


    }
}
