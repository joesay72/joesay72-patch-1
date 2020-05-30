import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframeDragnDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable");
        System.out.println(driver.findElement(By.cssSelector("iframe")).getSize());

        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source,target).build().perform();
        // After performing the drop and drag action and want to click outside the frame, this will fail
        // Becuase the switch is still within the frame so to click anything out side the iframe switch back to default
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@id=\"main\"]/form/label/span[2]/input")).click();
        driver.findElement(By.xpath("//*[@id=\"main\"]/form/label/span[2]/input")).sendKeys("accept");


    }
}
