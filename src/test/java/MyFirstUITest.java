import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MyFirstUITest
{

    public static void main(String[] args)
    {
        //Create a driver object
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ericd\\Documents\\Automation Class\\Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.google.com");


        driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("ericdodoo@yahoo.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }
}
