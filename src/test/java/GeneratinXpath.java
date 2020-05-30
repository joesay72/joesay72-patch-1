import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneratinXpath {

        public static void main(String[] args)
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com");
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ericdodoo@yahoo.com");
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vsat9613");
            driver.findElement(By.xpath("//input[@value='Log In']")).click();

        }
    }
