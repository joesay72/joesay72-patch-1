import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class YouTubeMusic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.youtube.com");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("you are yahweh by steve crown lyrics");
        driver.findElement(By.cssSelector("button[class='style-scope ytd-searchbox']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("[class='style-scope ytd-video-renderer']")).click();

        /*List<WebElement> list = driver.findElements(By.cssSelector("[class='style-scope ytd-video-renderer']"));

        for (int i = 1; i < 5; i++) {
            //System.out.println(list.get(i).getText());
            if (list.get(i).getText().contains("You Are Yahweh Lyrics . Steve Crown"))
            {
                list.get(i).click();
            }*/
        }
    }




