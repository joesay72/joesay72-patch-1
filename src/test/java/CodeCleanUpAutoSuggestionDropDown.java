import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CodeCleanUpAutoSuggestionDropDown {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://.www.easyjet.com/en");
        driver.manage().window().maximize();

        //Validate the CheckBox
        WebElement checkboxes = driver.findElement(By.cssSelector("span[class*='checkbox-container']"));
        System.out.println(checkboxes.isSelected());
        checkboxes.click();
        System.out.println(checkboxes.isSelected());

        // Validate the Department source city
        WebElement source = driver.findElement(By.name("origin"));
        source.click();
        source.sendKeys("fra");
        source.sendKeys(Keys.ARROW_DOWN);
        source.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        for (int i=0; i<13; i++)
        {
            source.sendKeys(Keys.ARROW_DOWN);
        }source.sendKeys(Keys.ENTER);

        //Validation Destination city/country
         WebElement destination = driver.findElement(By.name("destination"));
         destination.click();
         destination.sendKeys("be");
         destination.sendKeys(Keys.ARROW_DOWN);
         destination.sendKeys(Keys.ENTER);

        //Using loop code to dropdown the list and select destination
        for (int b=1; b<5; b++)
        {

            //Add passengers
            driver.findElement(By.xpath("//*[@id=\"pageWrapper\"]/main/div/div[1]/section/div[1]/div/div/ul/li[1]/div/div/form/div[4]/div[1]/div/div/button[2]/img[1]")).click();

        }



    }
}
