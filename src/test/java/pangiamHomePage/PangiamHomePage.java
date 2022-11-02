package pangiamHomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PangiamHomePage {
    WebDriver driver;
    public PangiamHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


}
