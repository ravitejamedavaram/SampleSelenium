import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseSetup {
    WebDriver driver;

    @BeforeSuite
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.org/");
    }

    @Test
    public void run() throws InterruptedException {
        BasePage basePage = PageFactory.initElements(driver, BasePage.class);
        System.out.println(driver.getCurrentUrl());
        basePage.englishLink.click();
        basePage.portalArts.click();
        List<WebElement> allElements = basePage.allElements;
        for (WebElement element : allElements){
            System.out.println(element.getText());

        }

    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
