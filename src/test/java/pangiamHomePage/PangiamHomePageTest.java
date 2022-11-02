package pangiamHomePage;

<<<<<<< HEAD
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
=======
import org.openqa.selenium.*;
>>>>>>> 47610e8 (kdfjkdjf)
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
<<<<<<< HEAD
=======
//hellow

>>>>>>> 47610e8 (kdfjkdjf)

    }
}
