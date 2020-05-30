import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Argos{

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://wwww.argos.co.uk");

        List<WebElement> list = driver.findElements(By.tagName("a"));
        for (WebElement myLinksCount : list)
        {
            String strListText = myLinksCount.getText();
            System.out.println(strListText);
        }
    }
}
