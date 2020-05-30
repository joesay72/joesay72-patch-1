import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class KeyBoardActions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        // passing driver capabilities of actions to handle the web pages with the interactions
        Actions a = new Actions(driver);
        WebElement mouseOver = driver.findElement(By.id("nav-link-accountList"));
        a.moveToElement(mouseOver).build().perform();
        //To perform right click after mouse over the element
        a.moveToElement(mouseOver).contextClick().build().perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("devopssec").doubleClick().build().perform();
    }
}
