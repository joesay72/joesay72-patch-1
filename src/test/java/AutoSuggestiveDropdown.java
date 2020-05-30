import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoSuggestiveDropdown {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.easyjet.com/en");


        driver.manage().window().maximize();

        //Validate the CheckBox
        System.out.println(driver.findElement(By.cssSelector("span[class*='checkbox-container']")).isSelected());
        driver.findElement(By.cssSelector("span[class*='checkbox-container']")).click();
        System.out.println(driver.findElement(By.cssSelector("span[class*='checkbox-container']")).isSelected());
        // Validate the Department source city
        driver.findElement(By.name("origin")).clear();
        driver.findElement(By.name("origin")).sendKeys("fra");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.name("origin")).sendKeys(Keys.ARROW_DOWN);
        //driver.findElement(By.name("origin")).sendKeys(Keys.ENTER);

        //Using loop code to dropdown the list and select destination
        for (int i=0; i<13; i++)
        {
            driver.findElement(By.name("origin")).sendKeys(Keys.ARROW_DOWN);


        }
        driver.findElement(By.name("origin")).sendKeys(Keys.ENTER);
        //Destination validation
        driver.findElement(By.name("destination")).clear();
        driver.findElement(By.name("destination")).sendKeys("be");
        driver.findElement(By.name("destination")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.name("destination")).sendKeys(Keys.ENTER);
        //Add passengers
        //driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/main/div/div[1]/section/div[1]/div/div/ul/li[1]/div/div/form/div[4]/div[1]/div/div/button[2]/img[1]")).click();

        for (int b=1; b<5; b++)
        {
            driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/main/div/div[1]/section/div[1]/div/div/ul/li[1]/div/div/form/div[4]/div[1]/div/div/button[2]/img[1]")).click();
        }
    }
}
