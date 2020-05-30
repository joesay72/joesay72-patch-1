import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EasyJetCalender {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.easyjet.com/en");

        driver.manage().window().maximize();

        //Validate the CheckBox
        System.out.println(driver.findElement(By.xpath("//*[@id=\"routedatepicker-86283\"]/span[1]/img")).isSelected());
        driver.findElement(By.xpath("//*[@id=\"routedatepicker-86283\"]/span[1]/img")).click();
    }

}
