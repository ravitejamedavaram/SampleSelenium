import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BasePage {


    @FindBy(id = "js-link-box-en")
    public WebElement englishLink;

    @FindBy(xpath = "//a[@title='Portal:Arts']")
    public WebElement portalArts;

    @FindAll(@FindBy(xpath = "//div[@id='portals-browsebar']//a"))
    public List<WebElement> allElements;

}
